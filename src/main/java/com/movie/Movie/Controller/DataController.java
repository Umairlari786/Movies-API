package com.movie.Movie.Controller;

import com.movie.Movie.Model.DataModel;
import com.movie.Movie.Serice.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {
@Autowired
    ServiceRepository repo;

    @PostMapping("/addMovies")
    public DataModel addMovies(@RequestBody DataModel dataModel)
    {
        return repo.save(dataModel);
    }

    @GetMapping("movies")
    public List<DataModel> getAllMovies()
    {
        return repo.findAll();
    }
}
