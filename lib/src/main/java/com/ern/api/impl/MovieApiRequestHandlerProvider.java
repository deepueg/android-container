package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * This class is simply a generated place holder for your implementations.!  This is just one way of providing implementations for the request handlers.
 * Feel free to modify this class as needed or even discard this and create your own implementation. This is added only to give a reference of how an api request handler implementation can be written.
 */
public class MovieApiRequestHandlerProvider extends RequestHandlerProvider<MovieApiRequestHandlerProvider.MovieApiConfig> implements MovieApiRequestHandler {

    /**
     * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
     */
    public MovieApiRequestHandlerProvider(@Nullable MovieApiRequestHandlerProvider.MovieApiConfig requestHandlerConfig) {
        super(requestHandlerConfig);
    }

    @Override
    public void registerGetTopRatedMoviesRequestHandler() {
        //TODO
    }

    @Override
    public void registerGetMovieDetailRequestHandler() {
        //TODO
    }

    public static class MovieApiConfig implements RequestHandlerConfig {

    }
}
