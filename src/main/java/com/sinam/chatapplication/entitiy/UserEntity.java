package com.sinam.chatapplication.entitiy;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private String userName;
    private String userPass;

    @ManyToMany
    private List<ChatEntity> usersChats;
}
