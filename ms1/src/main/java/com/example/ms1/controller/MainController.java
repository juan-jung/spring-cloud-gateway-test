package com.example.ms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class MainController {

    @GetMapping("/first")
    public String main() {
        return "ms1 - first";
    }
}
