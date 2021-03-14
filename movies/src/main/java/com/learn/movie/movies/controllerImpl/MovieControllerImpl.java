package com.learn.movie.movies.controllerImpl;

import com.learn.movie.movies.controller.MovieController;
import com.learn.movie.movies.model.Movie;
import com.learn.movie.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController()
public class MovieControllerImpl implements MovieController {
    @Value("${api.key}")
    private String apiKey;

    @Autowired
    MovieService movieService;

    public ResponseEntity<Movie> getMovieInfo(@PathVariable("id") String id) throws Exception{

        System.out.println("beginning/....");
        try {
            System.out.println("11111");
            Movie movieResponse = movieService.getMovie(id,apiKey);



            //RestTemplate restTemplate = new RestTemplate();
            //final String baseUrl = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey;
            //URI uri = new URI(baseUrl);

            //ResponseEntity<Movie> result = restTemplate.getForEntity(uri, Movie.class);


            System.out.println("here");
//            System.out.println(result.getBody());
            //result.getBody().contains("employeeList");

            return  ResponseEntity.status(HttpStatus.OK).body(movieResponse);
        } catch (Exception ex){
            throw new Exception();
        }

    }
}
