package com.nguyen.workday;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class Network {
    private static final String GIPHY_BASE_URL = "http://api.giphy.com/";

    GiphyService provideGiphyService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GIPHY_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(GiphyService.class);
    }
}
