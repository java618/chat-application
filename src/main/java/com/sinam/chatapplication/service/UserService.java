package com.sinam.chatapplication.service;

import com.sinam.chatapplication.entitiy.UserEntity;
import com.sinam.chatapplication.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public ResponseEntity<String> checkLogin(String name, String pass){
        if (userRepo.findUserEntityByUserNameAndUserPass(name, pass) == null){
            return new ResponseEntity<>("Username or Password is not correct", HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>("Login is successful", HttpStatus.OK);
        }
    }

    public ResponseEntity<List<UserEntity>> findAllUsers(){
        return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
    }
}
