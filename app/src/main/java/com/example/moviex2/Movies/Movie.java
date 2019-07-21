package com.example.moviex2.Movies;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String photo;
    private String title;
    private String genre;
    private String rating;
    private String duration;
    private String desc;
    private String actors;
    private String directors;
    private String production;
    private String releaseDate;
    private String country;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Movie() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.photo);
        dest.writeString(this.title);
        dest.writeString(this.genre);
        dest.writeString(this.rating);
        dest.writeString(this.duration);
        dest.writeString(this.desc);
        dest.writeString(this.actors);
        dest.writeString(this.directors);
        dest.writeString(this.production);
        dest.writeString(this.releaseDate);
        dest.writeString(this.country);
        dest.writeString(this.desc);
    }

    protected Movie(Parcel in) {
        this.photo = in.readString();
        this.title = in.readString();
        this.genre = in.readString();
        this.rating = in.readString();
        this.duration = in.readString();
        this.desc = in.readString();
        this.actors = in.readString();
        this.directors = in.readString();
        this.production = in.readString();
        this.releaseDate = in.readString();
        this.country = in.readString();
        this.desc = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };


}
