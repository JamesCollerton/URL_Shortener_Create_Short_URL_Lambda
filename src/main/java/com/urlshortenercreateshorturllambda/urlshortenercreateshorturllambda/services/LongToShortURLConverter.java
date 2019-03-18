package com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.services;

import java.util.function.Function;

public class LongToShortURLConverter implements Function<String, String> {

    public String apply(final String s) {
        return Integer.toString(s.hashCode());
    }

}
