package com.urlshortener.createshorturl.services;

import com.urlshortener.createshorturl.models.ShortenedUrlInformation;

import java.util.Optional;
import java.util.function.Function;

public interface UrlShortener extends Function<ShortenedUrlInformation, Optional<ShortenedUrlInformation>> {

    Optional<ShortenedUrlInformation> apply(ShortenedUrlInformation shortenedUrlInformation);

}
