package com.nguyen.workday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.nguyen.workday.databinding.ItemImageBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

class GiphyAdapter extends BaseAdapter {
    Context context;
    List<Giphy> images;

    GiphyAdapter(Context context) {
        this.context = context;
        this.images = new ArrayList<>();
    }

    public void update(List<Giphy> images) {
        this.images = images;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int i) {
        return images.get(i);
    }

    @Override
    public long getItemId(int i) {
        // return Long.parseLong(images.get(i).id);
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemImageBinding binding;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            binding = ItemImageBinding.inflate(inflater, viewGroup, false);
            view = binding.getRoot();
        } else {
            binding = (ItemImageBinding)view.getTag();
        }

        Giphy item = (Giphy)getItem(i);
        Picasso.get().load(item.imageDownsizedUrl).into(binding.gridImage);
        view.setTag(binding);

        return view;
    }
}
