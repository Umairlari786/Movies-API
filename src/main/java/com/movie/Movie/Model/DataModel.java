package com.movie.Movie.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Arrays;
import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
public class DataModel {

    /*   private String movieName;
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
        }*/

    @Id
    private ObjectId id;
    private String tmbdId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> geners;
    private List<String> backDrops;

    DataModel()
    {}
    /*
    * reviews id match with object id and title
    * */
   /* @Indexed
    @DocumentReference*/
   /* @DBRef
    private List<ReviewModel> reviewsId;*/


}
