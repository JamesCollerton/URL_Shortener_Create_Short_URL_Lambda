package com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.domain;

public class Response {

    private String longUrl;
    private String shortUrl;

    public Response() {
    }

    public Response(String longUrl, String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

}
