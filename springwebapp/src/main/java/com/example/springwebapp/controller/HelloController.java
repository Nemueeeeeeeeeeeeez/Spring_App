package com.example.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "こんにちは！Spring Boot Webアプリへようこそ");
        return "hello";  // hello.html を表示
    }
}
