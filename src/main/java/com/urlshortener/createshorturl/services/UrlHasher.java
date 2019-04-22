package com.urlshortener.createshorturl.services;

import java.util.function.Function;

public interface UrlHasher extends Function<String, String> {

    String apply(String s);

}
