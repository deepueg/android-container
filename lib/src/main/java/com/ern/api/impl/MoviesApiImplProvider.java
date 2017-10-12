package com.ern.api.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.ernmvoie.ern.api.MoviesApi;
import com.ernmvoie.ern.model.Movie;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is simply a generated place holder for your implementations.!  This is just one way of providing implementations for the request handlers.
 * Feel free to modify this class as needed or even discard this and create your own implementation. This is added only to give a reference of how an api request handler implementation can be written.
 */
public class MoviesApiImplProvider {

    private MoviesApiImplProvider() {
        //
    }
    
    public static void register() {
        Log.d("MoviesApiImplProvider", "Registering request handlers for Movie APi");
        registerGetTopRatedMoviesRequestHandler();
        registerGetMovieDetailRequestHandler();
    }

    private static void registerGetTopRatedMoviesRequestHandler() {
        Log.d("MoviesApiImplProvider", "registerGetTopRatedMoviesRequestHandler()");
        //TODO: Implement MoviesApi.requests().registerGetTopRatedMoviesRequestHandler(...) here if you would like the implement this api on native side.
        MoviesApi.requests().registerGetTopRatedMoviesRequestHandler(new ElectrodeBridgeRequestHandler<None, List<Movie>>() {
            @Override
            public void onRequest(@Nullable None payload, @NonNull ElectrodeBridgeResponseListener<List<Movie>> responseListener) {
                Log.d("MoviesApiImplProvider", "onRequest ---> GetTopRatedMoviesRequestHandler");
                List<Movie> movies = new ArrayList<Movie>() {{
                    add(new Movie.Builder("1", "The Shawshank Redemption").releaseYear(1994).rating(5f).imageUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ1ODM2MjY3OV5BMl5BanBnXkFtZTgwMTU2MjEyMDE@._V1_.jpg").build());
                    add(new Movie.Builder("2", "The Godfather").releaseYear(1972).rating(4.9f).imageUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BZTRmNjQ1ZDYtNDgzMy00OGE0LWE4N2YtNTkzNWQ5ZDhlNGJmL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_CR0,0,704,1000_AL_.jpg").build());
                    add(new Movie.Builder("3", "The Godfather: Part II ").releaseYear(1974).rating(4f).imageUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMGM0MzkxM2MtYWQ2My00NjYyLThhYmYtMTdkNTMyNmFmYTY1XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_CR0,0,701,1000_AL_.jpg").build());
                    add(new Movie.Builder("4", "The Dark Knight").releaseYear(2008).rating(4f).imageUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_SY1000_CR0,0,675,1000_AL_.jpg").build());
                    add(new Movie.Builder("5", "12 Angry Men").releaseYear(1957).rating(3f).imageUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SY1000_CR0,0,649,1000_AL_.jpg").build());
                }};
                responseListener.onSuccess(movies);
            }
        });
    }

    private static void registerGetMovieDetailRequestHandler() {
        //TODO: Implement MoviesApi.requests().registerGetMovieDetailRequestHandler(...) here if you would like the implement this api on native side.
    }
}
