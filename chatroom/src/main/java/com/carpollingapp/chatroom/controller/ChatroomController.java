package com.carpollingapp.chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatroomController {

    @GetMapping("/")
    public String openChatPage() {
        return "chat";
    }
}