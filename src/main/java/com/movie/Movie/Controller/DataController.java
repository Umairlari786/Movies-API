package com.movie.Movie.Controller;

import com.movie.Movie.Model.DataModel;
import com.movie.Movie.Serice.MovieService;
import com.movie.Movie.Serice.ServiceRepository;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class DataController {
@Autowired
    private MovieService movieService;
    //ServiceRepository repo;

//    @PostMapping("/addMovies")
//    public DataModel addMovies(@RequestBody DataModel dataModel)
//    {
//        //return movieService.s(dataModel);
//    }
    @PostMapping("/createMovies")
    public ResponseEntity<DataModel> addMovies(@RequestBody DataModel movie)
    {
        //DataModel newMovies = movieService.postMovie(movie);
        return new ResponseEntity<DataModel>(movieService.postMovie(movie),HttpStatus.OK);
    }



    @GetMapping("/allmovies")
    public ResponseEntity<List<DataModel>> getAllMovies()
    {
       /* try {*/
            //List<DataModel> movies = movieService.allMovies();
            return new ResponseEntity<List<DataModel>>(movieService.allMovies(), HttpStatus.OK);
         /*    } catch(Exception e)
            {
                return null;
               // System.out.println("NotAble to read ddata from database!");
            }*/
    }

    @GetMapping("/{tmbId}")
    public ResponseEntity<Optional<DataModel>> getById(@PathVariable String tmbdId)
    {
        Optional<DataModel> movie = movieService.movieId(tmbdId);
        return new ResponseEntity<Optional<DataModel>>(movie,HttpStatus.OK);
    }
}
