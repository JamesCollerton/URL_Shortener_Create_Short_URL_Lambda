package com.urlshortener.createshorturl.services;

import com.urlshortener.createshorturl.models.ShortenedUrlInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlShortenerImpl implements UrlShortener {

    @Autowired
    UrlHasher urlHasher;

//    @Autowired
//    ShortenedUrlInformationRepository shortenedUrlInformationRepository;

    @Override
    public Optional<ShortenedUrlInformation> apply(ShortenedUrlInformation shortenedUrlInformation) {

        Optional<String> longUrl = Optional.of(shortenedUrlInformation.getLongUrl());

        // Still needs DB step
        return longUrl
                .map(urlHasher)
                .map(s -> new ShortenedUrlInformation("id", longUrl.get(), s));
//                .map(shortenedUrlInformationRepository::save);

    }

}
