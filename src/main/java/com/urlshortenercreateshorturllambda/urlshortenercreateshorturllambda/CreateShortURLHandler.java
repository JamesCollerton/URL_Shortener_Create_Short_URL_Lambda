package com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.domain.Request;
import com.urlshortenercreateshorturllambda.urlshortenercreateshorturllambda.domain.Response;

public class CreateShortURLHandler implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        CreateShortURL createShortURL = new CreateShortURL(request.getLongUrl());
        return null;
    }
}
