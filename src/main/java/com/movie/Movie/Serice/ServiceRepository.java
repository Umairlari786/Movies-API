package com.movie.Movie.Serice;

import com.movie.Movie.Model.DataModel;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Optional;

@Repository

public interface ServiceRepository extends MongoRepository<DataModel, ObjectId> {

   Optional<DataModel> findMovieByTmbdId(String tmbdId);
}
