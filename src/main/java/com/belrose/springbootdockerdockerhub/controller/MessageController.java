package com.belrose.springbootdockerdockerhub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        return ResponseEntity.ok("Demo to push and pull images to docker hub...");
    }
}
