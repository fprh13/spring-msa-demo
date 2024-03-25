package com.example.MS1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class MainController {

    @GetMapping("/main")
    public ResponseEntity<?> mainPage() {
        return ResponseEntity.status(HttpStatus.OK).body("ms1 first");
    }
}
