package com.movie.Movie.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
@Document(collection = "movies")
public class DataModel {
    private String movieName;
    private String movieDes;
    private float movieRatinng;
    private String categories[];

    DataModel()
    {
        System.out.println("constructor called!");
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDes() {
        return movieDes;
    }

    public void setMovieDes(String movieDes) {
        this.movieDes = movieDes;
    }

    public float getMovieRatinng() {
        return movieRatinng;
    }

    public void setMovieRatinng(float movieRatinng) {
        this.movieRatinng = movieRatinng;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "DataController{" +
                "movieName='" + movieName + '\'' +
                ", movieDes='" + movieDes + '\'' +
                ", movieRatinng=" + movieRatinng +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }
}
