package com.sinam.chatapplication.repositories;

import com.sinam.chatapplication.entitiy.ChatEntity;
import com.sinam.chatapplication.entitiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChatRepo extends JpaRepository<ChatEntity, UUID> {
    ChatEntity findChatEntityByChatUsers(List<UserEntity> userEntities);
}
