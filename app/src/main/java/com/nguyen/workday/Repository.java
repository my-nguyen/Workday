package com.nguyen.workday;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class Repository {
    private static final String TAG = Repository.class.getSimpleName();
    private static final String GIPHY_BASE_URL = "https://api.giphy.com/";
    private static final String API_KEY = "dc6zaTOxFJmzC";

    private static Repository instance;

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    private GiphyService giphyService;

    private Repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GIPHY_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        giphyService = retrofit.create(GiphyService.class);
    }

    public LiveData<List<Giphy>> getTrending() {
        final MutableLiveData<List<Giphy>> data = new MutableLiveData<>();
        //query = URLEncoder.encode(query, "utf-8");
        giphyService.getTrending(API_KEY).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                List<Giphy> images = new ArrayList<>();
                if (response.body() != null) {
                    for (Data data : response.body().data) {
                        Giphy image = new Giphy(data);
                        images.add(image);
                    }
                } else {
                    Log.d(TAG, "response.body() null");
                }
                data.setValue(images);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d(TAG, "getTrending.onFailure");
            }
        });
        return data;
    }
}
