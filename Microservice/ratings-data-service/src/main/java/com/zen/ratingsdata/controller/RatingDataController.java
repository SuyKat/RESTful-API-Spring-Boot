package com.zen.ratingsdata.controller;

import com.zen.ratingsdata.model.Rating;
import com.zen.ratingsdata.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataController {
    @RequestMapping("/{movieId}")
    Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 9);
    }

    @RequestMapping("users/{userId}")
    UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratingList = Arrays.asList(
            new Rating("2342", 5),
            new Rating("2343", 7)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingList);
        return userRating;
    }
}
