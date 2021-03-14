package com.learn.movie.movies.service;

import com.learn.movie.movies.model.Movie;
import com.learn.movie.movies.service.client.MoviesFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    MoviesFeignClient moviesFeignClient;

    @Transactional(rollbackFor = Exception.class)
    public Movie getMovie (String id , String apiKey) throws Exception{

        try {
            System.out.println("in service layer");
            Movie resultFeignClient = moviesFeignClient.getMovies(id, apiKey);
            System.out.println(resultFeignClient);
            return resultFeignClient;
        } catch (Exception ex){
            throw new Exception(ex);
        }
    }

}
