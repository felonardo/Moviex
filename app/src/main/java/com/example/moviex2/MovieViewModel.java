package com.example.moviex2;

import android.util.Log;

import com.example.moviex2.Movies.Movie;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import cz.msebera.android.httpclient.Header;

public class MovieViewModel extends ViewModel {

    private static final String API_KEY = "d2c8f85857949c7b675714fb0c2d85f0";
    private MutableLiveData<ArrayList<Movie>> listMovie = new MutableLiveData<>();


    public void setListMovie(){
        //TODO

        AsyncHttpClient client = new AsyncHttpClient();
        final ArrayList<Movie> listItems = new ArrayList<>();
        String url = "https://api.themoviedb.org/3/discover/movie?api_key="+API_KEY+"&language=en-US";

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try{
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("results");

                    for (int i=0;i<list.length();i++){
                        JSONObject j = list.getJSONObject(i);
                        Movie movieItems = new Movie(j);
//                        movieItems.setGenre("animation");
                        listItems.add(movieItems);
                    }
                    listMovie.postValue(listItems);
                }catch (Exception e){
                    Log.d("Exception ", e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure",error.getMessage());
            }
        });
    }

    public LiveData<ArrayList<Movie>> getListMovies(){
        return listMovie;
    }

}
