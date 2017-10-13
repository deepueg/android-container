package com.ern.api.impl;

import android.support.annotation.NonNull;

public interface RequestHandlerConfig<T> {

    /**
     * @param requestName: Name of the request
     * @return An object that is needed to successfully handle the request.
     */
    @NonNull
    T configFor(@NonNull String requestName);
}
