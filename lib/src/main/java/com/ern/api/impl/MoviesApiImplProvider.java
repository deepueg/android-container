package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * This class is simply a generated place holder for your implementations.!  This is just one way of providing implementations for the request handlers.
 * Feel free to modify this class as needed or even discard this and create your own implementation. This is added only to give a reference of how an api request handler implementation can be written.
 */
public class MoviesApiImplProvider extends ApiImplProvider implements MovieApiRequestHandlerProvider {

    /**
     * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
     *                             Each request handler implementation can call back into ${{@link RequestHandlerConfig#configFor(String)}} method to fetch the config for a given api.
     */
    public MoviesApiImplProvider(@Nullable RequestHandlerConfig requestHandlerConfig) {
        super(requestHandlerConfig);
    }

    @Override
    public void init() {
        registerGetTopRatedMoviesRequestHandler();
        registerGetMovieDetailRequestHandler();
    }

    @Override
    public void registerGetTopRatedMoviesRequestHandler() {
        //requestHandlerConfig.configFor("GetTopRatedMovies");
        //TODO
    }

    @Override
    public void registerGetMovieDetailRequestHandler() {
        //requestHandlerConfig.configFor("GetMovieDetail");
        //TODO
    }
}
