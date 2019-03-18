package com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda;

import com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.domain.Response;
import com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.services.LongToShortURLConverter;

import java.util.function.Function;

public class CreateShortURL implements Function<String, Response> {

    @Override
    public Response apply(String longUrl) {
        // Create a short version
        String shortUrl = new LongToShortURLConverter().apply(longUrl);

        // Save to the database


        // Create and return a response
        return new Response(longUrl, shortUrl);
    }
}
