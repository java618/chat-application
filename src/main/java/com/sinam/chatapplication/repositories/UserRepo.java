package com.sinam.chatapplication.repositories;

import com.sinam.chatapplication.entitiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, UUID> {
    UserEntity findUserEntityByUserNameAndUserPass(String name, String pass);
}
