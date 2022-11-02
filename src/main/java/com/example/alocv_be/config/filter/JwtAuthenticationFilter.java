package com.example.alocv_be.config.filter;

import com.example.alocv_be.service.JwtService;
import com.example.alocv_be.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private JwtService jwtService;

    @Autowired
    AccountService accountService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = getTokenFromRequest(request);
            if (token != null) {
                // lấy username trong token
                String username = jwtService.getAccountFromJwtToken(token);
                // lấy ra UserDetails thông qua username
                UserDetails userDetails1 = accountService.loadUserByUsername(username);
////                UserDetails userDetails2 = teacherService.loadUserByUsername(username);

                // thực hiện việc xắc thực thông qua token.
                UsernamePasswordAuthenticationToken authentication1 = new UsernamePasswordAuthenticationToken(
                        userDetails1, null, userDetails1.getAuthorities());
                authentication1.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication1);


//                UsernamePasswordAuthenticationToken authentication2 = new UsernamePasswordAuthenticationToken(
//                        userDetails2, null, userDetails2.getAuthorities());
//                authentication2.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authentication2);
            }
            else {

            }
        } catch (Exception e) {
            logger.error("Can NOT set user authentication -> Message: {}", e);
        }

        filterChain.doFilter(request, response);
    }


    private String getTokenFromRequest(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.replace("Bearer ", "");
        }
        return null;
    }
}
