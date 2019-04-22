package com.urlshortener.createshorturl.services;

import org.springframework.stereotype.Service;

@Service
public class UrlHasherImpl implements UrlHasher {

    @Override
    public String apply(String s) {
        return Integer.toString(s.hashCode());
    }

}
