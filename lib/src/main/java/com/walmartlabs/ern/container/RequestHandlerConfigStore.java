package com.walmartlabs.ern.container;

import android.support.annotation.Nullable;

import com.ern.api.impl.RequestHandlerConfig;

/**
 * A class that holds all the request handler configs.
 */

public class RequestHandlerConfigStore {
    private RequestHandlerConfig movieApiConfig;

    public RequestHandlerConfigStore(Builder builder) {
        this.movieApiConfig = builder.movieApiConfig;
    }

    public RequestHandlerConfig getMovieApiConfig() {
        return movieApiConfig;
    }

    public static class Builder {
        private RequestHandlerConfig movieApiConfig;

        public Builder() {

        }

        public Builder movieApiConfig(@Nullable RequestHandlerConfig movieApiConfig) {
            this.movieApiConfig = movieApiConfig;
            return this;
        }

        public RequestHandlerConfigStore build() {
            return new RequestHandlerConfigStore(this);
        }
    }

}
