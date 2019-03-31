package com.urlshortener.createshorturl.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/**")
public class LambdaController {

    @GetMapping
    public ResponseEntity<String> get() {
        System.out.println("In handler");
        return ResponseEntity.ok("OK");
    }

}