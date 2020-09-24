package com.nguyen.workday;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface GiphyService {
    // http://api.giphy.com/v1/gifs/trending?api_key=dc6zaTOxFJmzC
    @GET("v1/gifs/trending")
    Call<Example> getTrending(@Query("api_key") String apiKey);

    // http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC
    @GET("v1/gifs/search")
    Call<Example> search(@Query("q") String query, @Query("api_key") String apiKey);
}
