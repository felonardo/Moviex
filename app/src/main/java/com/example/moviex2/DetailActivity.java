package com.example.moviex2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviex2.Movies.Movie;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_MOVIE = "extra_movie";

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_rating)
    TextView tvRating;
    @BindView(R.id.tv_duration)
    TextView tvDuration;
    @BindView(R.id.tv_desc)
    TextView tvDesc;
    @BindView(R.id.tv_actors)
    TextView tvActors;
    @BindView(R.id.tv_directors)
    TextView tvDirectors;
    @BindView(R.id.tv_production)
    TextView tvProductions;
    @BindView(R.id.tv_releasedate)
    TextView tvReleaseDate;
    @BindView(R.id.tv_country)
    TextView tvCountry;
    @BindView(R.id.tv_genre)
    TextView tvGenre;
    @BindView(R.id.img_photo)
    ImageView ImgPhoto;
    @BindView(R.id.img_background)
    ImageView ImgBackground;

    String search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().hide();

        ButterKnife.bind(this);

        ImgBackground.setOnClickListener(this);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);


        search = movie.getTitle();

        tvTitle.setText(movie.getTitle());
        tvRating.setText(movie.getRating());
        tvDuration.setText(movie.getDuration());
        tvDesc.setText(movie.getDesc());
        tvActors.setText(movie.getActors());
        tvDirectors.setText(movie.getDirectors());
        tvProductions.setText(movie.getProduction());
        tvReleaseDate.setText(movie.getReleaseDate());
        tvCountry.setText(movie.getCountry());
        tvGenre.setText(movie.getGenre());
        Glide.with(this).load(Uri.parse(movie.getPhoto())).into(ImgPhoto);
        Glide.with(this).load(Uri.parse(movie.getPhoto())).apply(RequestOptions.bitmapTransform(new BlurTransformation(25, 3))).into(ImgBackground);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.img_background) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.youtube.com/results?search_query=" + search + " Trailer"));
            startActivity(intent);
        }
    }

    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_out_down, R.anim.slide_in_down);
    }
}
