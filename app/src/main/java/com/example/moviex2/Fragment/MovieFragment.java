package com.example.moviex2.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviex2.DetailActivity;
import com.example.moviex2.ItemClickSupport;
import com.example.moviex2.Adapter.ListMovieAdapter;
import com.example.moviex2.Movies.Movie;
import com.example.moviex2.Movies.Moviedata;
import com.example.moviex2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

//    private @BindView(R.id.rv_category)
    RecyclerView rvCategory;
    private ArrayList<Movie> list = new ArrayList<>();
    private Moviedata moviedata = new Moviedata();

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);


    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCategory = view.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(moviedata.getListData());

        showRecyclerList();


    }


    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(getContext()));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(getContext());
        listMovieAdapter.setListMovie(list);
        rvCategory.setAdapter(listMovieAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMovie(list.get(position));
            }
        });


    }

    private void showSelectedMovie(Movie movie) {
        Intent detailIntent = new Intent(getContext(), DetailActivity.class);
        detailIntent.putExtra(DetailActivity.EXTRA_MOVIE, movie);
        startActivity(detailIntent);
        getActivity().overridePendingTransition(R.anim.slide_out_up, R.anim.slide_in_up);
    }

}
