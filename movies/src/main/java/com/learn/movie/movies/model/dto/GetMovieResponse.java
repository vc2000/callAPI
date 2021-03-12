package com.learn.movie.movies.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetMovieResponse {
    private List<MovieInfo> movies;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MovieInfo {
        private Boolean adult;
        private String backdrop_path;
        private String belongs_to_collection;
        private Integer budget;
        private List<Genres> genres;
        private String homepage;
        private Integer id;

        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class Genres {
            private Integer id;
            private String name;
        }
    }





//                "imdb_id":"tt0137523",
//                "original_language":"en",
//                "original_title":"Fight Club",
//                "overview":"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.",
//                "popularity":39.73,"poster_path":"/8kNruSfhk5IoE4eZOc4UpvDn6tq.jpg",
//                "production_companies":[
//        {"id":508,"logo_path":"/7PzJdsLGlR7oW4J0J5Xcd0pHGRg.png","name":"Regency Enterprises","origin_country":"US"},
//        {"id":711,"logo_path":"/tEiIH5QesdheJmDAqQwvtN60727.png","name":"Fox 2000 Pictures","origin_country":"US"},
//        {"id":20555,"logo_path":"/hD8yEGUBlHOcfHYbujp71vD8gZp.png","name":"Taurus Film","origin_country":"DE"},
//        {"id":54051,"logo_path":null,"name":"Atman Entertainment","origin_country":""},
//        {"id":54052,"logo_path":null,"name":"Knickerbocker Films","origin_country":"US"},
//        {"id":25,"logo_path":"/qZCc1lty5FzX30aOCVRBLzaVmcp.png","name":"20th Century Fox","origin_country":"US"},
//        {"id":4700,"logo_path":"/A32wmjrs9Psf4zw0uaixF0GXfxq.png","name":"The Linson Company","origin_country":"US"}
//        ],
//                "production_countries":[
//        {"iso_3166_1":"DE","name":"Germany"},
//        {"iso_3166_1":"US","name":"United States of America"}
//        ],
//                "release_date":"1999-10-15",
//                "revenue":100853753,
//                "runtime":139,
//                "spoken_languages":[
//        {"english_name":"English","iso_639_1":"en","name":"English"}
//        ],
//                "status":"Released",
//                "tagline":"Mischief. Mayhem. Soap.",
//                "title":"Fight Club",
//                "video":false,
//                "vote_average":8.4,
//                "vote_count":21272
//    }

}
