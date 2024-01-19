package com.movie.Movie.Serice;

import com.movie.Movie.Model.DataModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private ServiceRepository serviceRepo;

    public List<DataModel> allMovies()
    {
        return serviceRepo.findAll();
    }
    /*
     *use options it means if movie id does not exist.
     * then it return Null
     *  */
    public Optional<DataModel> movieId(String tmbdId)
    {
        return serviceRepo.findMovieByTmbdId(tmbdId);
    }

    public DataModel postMovie(DataModel movies)
    {
        DataModel savedMovie = serviceRepo.save(movies);
        return savedMovie;
    }
}
