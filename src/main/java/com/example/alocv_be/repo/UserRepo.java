package com.example.alocv_be.repo;

import com.example.alocv_be.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends PagingAndSortingRepository<User,Long> {
    Optional<User> findStudentByAccount_UserName(String userName);

}
