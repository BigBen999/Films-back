package org.factoriaf5.films.payload.request;

import lombok.Getter;
import lombok.Setter;
//DTO
@Getter
@Setter
public class FilmRequest {
    private long id;
    private String name;
    private String status;
    private  String image;
    private String origin;
    private String location;

}

