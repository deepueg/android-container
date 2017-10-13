package com.ern.api.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * GENERATED CODE: DO NOT MODIFY
 * Do not modify the content of this class as it will be regenerated every time an api-impl regen command is executed.
 * Link: TODO: provide the electrode native link to ern regen-api-impl here.
 */

abstract class ApiImplProvider {

    protected RequestHandlerConfig requestHandlerConfig;

    /**
     * @param requestHandlerConfig: Optional config object that can be passed to an api impl provider.
     */
    public ApiImplProvider(@Nullable RequestHandlerConfig requestHandlerConfig) {
        this.requestHandlerConfig = requestHandlerConfig;
    }

    public void setRequestHandlerConfig(@NonNull RequestHandlerConfig requestHandlerConfig) {
        this.requestHandlerConfig = requestHandlerConfig;
    }

}
