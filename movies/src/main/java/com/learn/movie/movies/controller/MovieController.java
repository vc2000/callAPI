package com.learn.movie.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@RestController()
@RequestMapping(path ="/movies", produces = "application/json")
public class MovieController {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value= "/movie/{id}" ,produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public void getMovieInfo(@PathVariable("id") String id) throws Exception{
        try {
            RestTemplate restTemplate = new RestTemplate();
            final String baseUrl = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey;
            URI uri = new URI(baseUrl);

            ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
            System.out.println("here");
            System.out.println(result.getBody());
            //result.getBody().contains("employeeList");
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
