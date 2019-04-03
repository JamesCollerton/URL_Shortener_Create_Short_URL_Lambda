package com.urlshortener.createshorturl.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortenedURLInformation {

    private Optional<String> longUrl;
    private Optional<String> shortUrl;

}
