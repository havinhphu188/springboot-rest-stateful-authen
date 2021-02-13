package com.example.statefulauthen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("api/entry-point")
    public ResponseEntity<String> entryPointWithAPI(){
        return ResponseEntity.ok("entry-point");
    }
}
