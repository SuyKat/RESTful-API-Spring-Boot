package com.zen.movieinfo.controller;

import com.zen.movieinfo.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieController {
    @RequestMapping("/{moviesId}")
    Movie getMovie(@PathVariable("moviesId") String movieId){
        return new Movie("123", "Matrix");
    }
}
