package com.nguyen.workday;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.nguyen.workday.databinding.ActivityDetailBinding;
import com.squareup.picasso.Picasso;

class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        Giphy giphy = (Giphy)getIntent().getSerializableExtra("EXTRA_GIPHY");
        Picasso.get().load(giphy.imageDownsizedUrl).into(binding.dtImage);
        binding.dtUsername.setText(giphy.username);
        binding.dtRating.setText(giphy.rating);
        binding.dtSource.setText(giphy.source);
    }
}
