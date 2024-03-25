package com.example.MS2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms2")
public class MainController {

    @GetMapping("/main")
    public ResponseEntity<?> mainPage() {
        return ResponseEntity.status(HttpStatus.OK).body("ms2 second");
    }
}
