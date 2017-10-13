package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * This class is simply a generated place holder for your implementations.!  This is just one way of providing implementations for the request handlers.
 * Feel free to modify this class as needed or even discard this and create your own implementation. This is added only to give a reference of how an api request handler implementation can be written.
 */
public class MovieApiRequestHandlerProvider extends ApiImplProvider implements MovieApiRequestHandler {

    //////DO NOT GENERATE
    MovieApiConfig movieApiConfig;
    //////DO NOT GENERATE

    /**
     * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
     */
    public MovieApiRequestHandlerProvider(@Nullable RequestHandlerConfig requestHandlerConfig) {
        super(requestHandlerConfig);

        //////DO NOT GENERATE
        if (requestHandlerConfig != null && !(requestHandlerConfig instanceof MovieApiConfig)) {
            throw new RuntimeException("Looks like a wrong config has been passed, expected:MovieApiConfig, received:" + requestHandlerConfig.getClass().getSimpleName());
        }
        movieApiConfig = (MovieApiConfig) requestHandlerConfig;
        //////DO NOT GENERATE
    }

    @Override
    public void registerGetTopRatedMoviesRequestHandler() {
        //TODO
    }

    @Override
    public void registerGetMovieDetailRequestHandler() {
        //TODO
    }


    //////DO NOT GENERATE
    //This code will not be generated, added here as a place holder to show case how the config can be used
    public static class MovieApiConfig implements RequestHandlerConfig {

    }
    //////DO NOT GENERATE

}
