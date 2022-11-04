package com.example.alocv_be.service.user;

import com.example.alocv_be.model.entity.User;
import com.example.alocv_be.service.IGerenalService;

import java.util.Optional;

public interface IUserService extends IGerenalService<User> {


    Optional<User> findUserByAccount_UserName(String userName);
}
