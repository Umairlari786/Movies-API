package com.movie.Movie.Serice;

import com.movie.Movie.Model.DataModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceRepository extends MongoRepository<DataModel,String> {
}
