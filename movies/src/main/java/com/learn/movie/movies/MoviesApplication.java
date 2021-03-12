package com.learn.movie.movies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MoviesApplication {

	@Bean( name = "movieRestTemplate")
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON));
		ObjectMapper objectMapper = new ObjectMapper()
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
				.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		converter.setObjectMapper(objectMapper);

		restTemplate.getMessageConverters().add(converter);

		return restTemplate;
	}
	public static void main(String[] args) {



		SpringApplication.run(MoviesApplication.class, args);


//		try {
//			URL url = new URL("https://api.themoviedb.org/3/movie/550?api_key=42a71c65eb858ea2147b9b4b7a990fe7");
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.connect();
//
//			int responsecode = conn.getResponseCode();
//			if (responsecode != 200) {
//				throw new RuntimeException("HttpResponseCode: " + responsecode);
//			} else {
//
//				String inline = "";
//				Scanner scanner = new Scanner(url.openStream());
//
//				//Write all the JSON data into a string using a scanner
//				while (scanner.hasNext()) {
//					inline += scanner.nextLine();
//				}
//				//Close the scanner
//				scanner.close();
//
//				//Using the JSON simple library parse the string into a json object
//				JSONParser parse = new JSONParser();
//				JSONObject data_obj = (JSONObject) parse.parse(inline);
//
//				System.out.println("heeeeeeeeeee::::::");
//				System.out.println(data_obj);
//
//				for (int i = 0; i < data_obj.size(); i++) {
//					JSONObject new_obj = (JSONObject) data_obj.get(i);
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

//	@FeignClient("name")
//	static interface NameService {
//		@RequestMapping("/")
//		public String getName();
//	}
}
