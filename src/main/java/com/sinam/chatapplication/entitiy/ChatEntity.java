package com.sinam.chatapplication.entitiy;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
@Entity
public class ChatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID chatId;

    @OneToMany
    private List<MessagesEntity> chatMessages;

    @ManyToMany(mappedBy = "UserEntity")
    private List<UserEntity> chatUsers;


}
