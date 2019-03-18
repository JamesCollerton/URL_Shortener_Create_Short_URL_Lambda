package com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.domain;

public class Request {

    private String longUrl;

    public Request() {
    }

    public Request(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }
}
