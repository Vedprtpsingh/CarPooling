package com.carpollingapp.chatroom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.carpollingapp.chatroom.entity.Message;

public interface MessageRepository extends MongoRepository<Message, String> {

}