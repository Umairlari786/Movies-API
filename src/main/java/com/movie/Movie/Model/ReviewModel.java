package com.movie.Movie.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@NoArgsConstructor  // Add this annotation to generate a no-argument constructor
public class ReviewModel {
    @Id
    private ObjectId id;
    private String body;

    // Add @JsonCreator and @JsonProperty annotations to the existing constructor
    @JsonCreator
    public ReviewModel(@JsonProperty("id") ObjectId id, @JsonProperty("body") String body) {
        this.id = id;
        this.body = body;
    }
}
