package com.zen.ratingsdata.controller;

import com.zen.ratingsdata.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingDataController {
    @RequestMapping("/{movieId}")
    Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 9);
    }
}
