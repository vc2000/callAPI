//package com.learn.movie.movies.service.client;
//import com.learn.movie.movies.model.dto.GetMovieResponse;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@FeignClient(name="MoviesFeignClient", url="${integration.web-movie-api.base-url}")
//public interface MoviesFeignClient {
//
//    @GetMapping(value = "550?api_key=42a71c65eb858ea2147b9b4b7a990fe7")
//
//    List<GetMovieResponse> getMovies(@RequestParam("movieId") String movieId, @RequestParam("api_key") String api_key);
//
//}
