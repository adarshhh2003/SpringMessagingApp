package com.example.app.controller;

import com.example.app.model.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello From BridgeLabz!";
    }

    @PostMapping
    public String postHello() {
        return "Hello From BridgeLabz! (Post Request)";
    }

    @PutMapping
    public String putHello() {
        return "Hello From BridgeLabz! (Put Request)";
    }

    @DeleteMapping
    public String deleteHello() {
        return "Hello From BridgeLabz! (Delete Request)";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name +  " from BridgeLabz!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloAsPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
