package com.sinam.chatapplication.entitiy;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class MessagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long messageId;

    private String fromUserName;
    private String toUserName;

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    private String messageBody;

    @ManyToOne
    private ChatEntity chat;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public ChatEntity getChat() {
        return chat;
    }

    public void setChat(ChatEntity chat) {
        this.chat = chat;
    }
}
