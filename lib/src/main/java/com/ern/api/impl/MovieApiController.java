package com.ern.api.impl;

import android.support.annotation.Nullable;
import android.util.Log;

/**
 * GENERATED CODE: DO NOT MODIFY
 * Do not modify the content of this class as it will be regenerated every time an api-impl regen command is executed.
 * Link: TODO: provide the electrode native link to ern regen-api-impl here.
 */
public final class MovieApiController {
    private static MovieApiRequestHandlerProvider sRequestHandler;

    private MovieApiController() {
        //private constructor
    }

    public static void register(@Nullable MovieApiRequestHandlerProvider.MovieApiConfig requestHandlerConfig) {
        if (sRequestHandler == null) {
            sRequestHandler = new MovieApiRequestHandlerProvider(requestHandlerConfig);
            sRequestHandler.registerGetTopRatedMoviesRequestHandler();
            sRequestHandler.registerGetMovieDetailRequestHandler();
        } else {
            Log.w("MovieApiController", "A request handler is already registered, ignoring duplicate register call");
        }
    }
}
