package com.learn.movie.movies.model;

public class Movie {

    private String name;
    private String desc;
    private int rating;
    private boolean adult;

    public Movie(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.adult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean getAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
}
