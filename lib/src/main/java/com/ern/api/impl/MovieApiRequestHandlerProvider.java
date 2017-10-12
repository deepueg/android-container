package com.ern.api.impl;

interface MovieApiRequestHandlerProvider extends ApiRequestHandlerProvider {
    void registerGetMovieDetailRequestHandler();

    void registerGetTopRatedMoviesRequestHandler();
}
