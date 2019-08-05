package com.example.moviex2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviex2.Movies.Movie;
import com.example.moviex2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie= new ArrayList<>();


    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    public ListMovieAdapter() {

    }

    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie.clear();
        this.listMovie.addAll(listMovie);
        notifyDataSetChanged();

//        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movies, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvTitle.setText(getListMovie().get(position).getTitle());
        categoryViewHolder.tvGenre.setText(getListMovie().get(position).getGenre());
        categoryViewHolder.tvRating.setText(getListMovie().get(position).getRating());
        categoryViewHolder.tvDuration.setText(getListMovie().get(position).getDuration());

        Glide.with(context)
                .load(getListMovie().get(position).getPhoto())
                .apply(new RequestOptions().override(1000, 2000))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvRating;
        TextView tvGenre;
        TextView tvDuration;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View v) {
            super(v);
            this.tvTitle=v.findViewById(R.id.tv_title);
            this.tvGenre=v.findViewById(R.id.tv_genre);
            this.imgPhoto=v.findViewById(R.id.img_photo);
            this.tvRating=v.findViewById(R.id.tv_rating);
            this.tvDuration=v.findViewById(R.id.tv_duration);
        }


    }
}

