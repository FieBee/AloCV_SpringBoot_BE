package com.example.alocv_be.controller;


import com.example.alocv_be.model.entity.User;
import com.example.alocv_be.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAllCustomer(Pageable pageable) {
        List<User> customers = (List<User>) userService.findAll(pageable);
        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> users =userService.findById(id);
        if (!users.isPresent()){
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(users.get(),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> save(@Valid @RequestBody User customer){
        return new ResponseEntity<>(userService.save(customer), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@Valid @PathVariable Long id,@RequestBody User customer){
        Optional<User> users = userService.findById(id);
        if (!users.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customer.setId(users.get().getId());
        return new ResponseEntity<>(userService.save(customer),HttpStatus.OK);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<User> deleteUser(@PathVariable Long id){
//        Optional<User> users = userService.findById(id);
//        if (!users.isPresent()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        userService.remove(id);
//        return new ResponseEntity<>(users.get(),HttpStatus.OK);
//    }
    //    sử dụng @ExceptionHandler annotation để bắt MethodArgumentNotValidException ném ra từ Spring Boot khi có
//    lỗi validate để xử lý và trả về kết quả lỗi cho client.
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @GetMapping("/getUser/{userName}")
    public ResponseEntity<User> findByAccount(@PathVariable String userName) {
        Optional<User> user = userService.findUserByAccount_UserName(userName);
        if (!user.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user.get(), HttpStatus.OK);
    }
}
