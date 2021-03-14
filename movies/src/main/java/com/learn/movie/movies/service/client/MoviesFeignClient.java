package com.learn.movie.movies.service.client;
import com.learn.movie.movies.model.Movie;
import com.learn.movie.movies.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="MoviesFeignClient", url="${integration.web-movie-api.base-url}")
public interface MoviesFeignClient {

    @GetMapping(value = "/{id}?api_key={apiKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    Movie getMovies(@RequestParam("id") String id, @RequestParam("apiKey") String apiKey); //@RequestHeader("X-Auth-Token") String authHeader,

}
