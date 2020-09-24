package com.nguyen.workday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.nguyen.workday.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private GiphyViewModel viewModel;
    private GiphyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        adapter = new GiphyAdapter(this);
        binding.gridview.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(GiphyViewModel.class);
        viewModel.getTrending().observe(MainActivity.this, new Observer<List<Giphy>>() {
            @Override
            public void onChanged(List<Giphy> giphies) {
                adapter.update(giphies);
            }
        });

        binding.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(MainActivity.this, DetailActivity.class);
                Giphy giphy = adapter.images.get(i);
                it.putExtra("EXTRA_GIPHY", giphy);
                startActivity(it);
            }
        });
    }
}