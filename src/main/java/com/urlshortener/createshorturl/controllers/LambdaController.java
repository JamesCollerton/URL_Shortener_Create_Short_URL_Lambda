package com.urlshortener.createshorturl.controllers;

import com.urlshortener.createshorturl.models.ShortenedURLInformation;
import com.urlshortener.createshorturl.services.URLShortener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/**")
public class LambdaController {

    @Autowired
    private URLShortener urlShortener;

    /*
        TODO: Validate the request body
        TODO: Map null to optional
     */
    @GetMapping
    public ResponseEntity<ShortenedURLInformation> get(@RequestBody ShortenedURLInformation shortenedURLInformation) {
        System.out.println("In handler");

        Optional<ShortenedURLInformation> response = urlShortener.apply(shortenedURLInformation);

        return response.map(ResponseEntity::ok).orElse(ResponseEntity.badRequest().build());
    }

}
