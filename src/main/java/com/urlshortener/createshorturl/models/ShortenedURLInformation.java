package com.urlshortener.createshorturl.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortenedURLInformation {

    private Optional<String> longUrl = Optional.empty();
    private Optional<String> shortUrl = Optional.empty();

}
