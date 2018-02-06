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

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.ernpetstore.ern.api.PetApi;
import com.ernpetstore.ern.model.Pet;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a generated place holder for your Pet implementations.!
 * Feel free to modify this class contents as needed. `ern regen-api-impl` command WILL NOT modify the content of this class.
 * Don't modify the class name as this naming convention is used for container generation.
 */
public class PetApiRequestHandlerProvider extends RequestHandlerProvider<PetApiRequestHandlerProvider.PetApiConfig> implements PetApiRequestHandler {

    /**
     * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
     */
    PetApiRequestHandlerProvider(@Nullable PetApiRequestHandlerProvider.PetApiConfig requestHandlerConfig) {
        super(requestHandlerConfig);
    }

    @Override
    public void registerUpdatePetRequestHandler() {
        //TODO
    }

    @Override
    public void registerAddPetRequestHandler() {
        //TODO
    }

    @Override
    public void registerFindPetsByStatusRequestHandler() {

        //Sample Implemenatation to return dummy pet list.
        PetApi.requests().registerFindPetsByStatusRequestHandler(new ElectrodeBridgeRequestHandler<List<String>, List<Pet>>() {
            @Override
            public void onRequest(@Nullable List<String> payload, @NonNull ElectrodeBridgeResponseListener<List<Pet>> responseListener) {
                List<String> photoUrls = new ArrayList<String>() {{
                }};
                final Pet pet = new Pet.Builder("Dog", photoUrls).build();

                List<Pet> pets = new ArrayList<Pet>() {{
                    add(pet);
                }};
                responseListener.onSuccess(pets);
            }
        });
    }

    @Override
    public void registerFindPetsByTypeRequestHandler() {

    }

    @Override
    public void registerFindPetsByTagsRequestHandler() {
        //TODO
    }

    @Override
    public void registerGetPetByIdRequestHandler() {
        //TODO
    }

    @Override
    public void registerUpdatePetWithFormRequestHandler() {
        //TODO
    }

    @Override
    public void registerDeletePetRequestHandler() {
        //TODO
    }

    @Override
    public void registerUploadFileRequestHandler() {
        //TODO
    }

    // DO NOT rename this class as this naming convention is used when a container is generated.
    public static class PetApiConfig implements RequestHandlerConfig {

    }
}