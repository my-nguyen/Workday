package com.nguyen.workday;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class GiphyViewModel extends ViewModel {
    private static final String TAG = GiphyViewModel.class.getSimpleName();

    private Repository repository;

    public GiphyViewModel() {
        repository = Repository.getInstance();
    }

    public LiveData<List<Giphy>> getTrending() {
        return repository.getTrending();
    }
}
