package com.carpollingapp.chatroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.carpollingapp.chatroom.entity.Message;
import com.carpollingapp.chatroom.repository.MessageRepository;

@RestController
@RequestMapping("/api/messages")
public class ChatroomController {

    @Autowired
    private MessageRepository repository;

    @PostMapping
    public Message save(@RequestBody Message message) {
        return repository.save(message);
    }

    @GetMapping
    public List<Message> getAll() {
        return repository.findAll();
    }
}