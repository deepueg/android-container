/*
 * Copyright 2017 WalmartLabs
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * This class is a generated place holder for your implementations.!
 * Feel free to modify this class contents as needed. `ern regen-api-impl` command WILL NOT modify the content of this class.
 * Don't modify the class name as this naming convention is used for container generation.
 */
public class MovieApiRequestHandlerProvider extends RequestHandlerProvider<MovieApiRequestHandlerProvider.MovieApiConfig> implements MovieApiRequestHandler {

    /**
     * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
     */
    MovieApiRequestHandlerProvider(@Nullable MovieApiRequestHandlerProvider.MovieApiConfig requestHandlerConfig) {
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

    // DO NOT rename this class as this naming convention is followed when a container is generated.
    public static class MovieApiConfig implements RequestHandlerConfig {

    }
}
