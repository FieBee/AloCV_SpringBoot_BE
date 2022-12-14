package com.example.alocv_be.service.user;

import com.example.alocv_be.model.User;
import com.example.alocv_be.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService implements IUserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public Iterable<User> findAll(Pageable pageable) {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void remove(Long id) {
    }

    @Override
    public Optional<User> findUserByAccount_UserName(String userName) {
        return userRepo.findStudentByAccount_UserName(userName);
    }
}
