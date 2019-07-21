package com.example.moviex2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviex2.R;
import com.example.moviex2.TvShows.TvShow;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListTvShowAdapter extends RecyclerView.Adapter<ListTvShowAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<TvShow> listTvShow;

    public ListTvShowAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TvShow> getListTvShow() {
        return listTvShow;
    }

    public void setListTvShow(ArrayList<TvShow> listTvShow) {
        this.listTvShow = listTvShow;
    }

    @NonNull
    @Override
    public ListTvShowAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movies, viewGroup, false);
        return new ListTvShowAdapter.CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTvShowAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvTitle.setText(getListTvShow().get(position).getTitle());
        categoryViewHolder.tvGenre.setText(getListTvShow().get(position).getGenre());
        categoryViewHolder.tvRating.setText(getListTvShow().get(position).getRating());
        categoryViewHolder.tvDuration.setText(getListTvShow().get(position).getDuration());

        Glide.with(context)
                .load(getListTvShow().get(position).getPhoto())
                .apply(new RequestOptions().override(1000, 2000))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListTvShow().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvRating;
        TextView tvGenre;
        TextView tvDuration;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View v) {
            super(v);
            this.tvTitle = v.findViewById(R.id.tv_title);
            this.tvGenre = v.findViewById(R.id.tv_genre);
            this.imgPhoto = v.findViewById(R.id.img_photo);
            this.tvRating = v.findViewById(R.id.tv_rating);
            this.tvDuration = v.findViewById(R.id.tv_duration);
        }


    }
}
