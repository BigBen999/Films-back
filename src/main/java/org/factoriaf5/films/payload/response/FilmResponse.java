package org.factoriaf5.films.payload.response;
import lombok.*;
import org.factoriaf5.films.entity.Film;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class FilmResponse {
    private Film film;
    private Set<String> courses;
}



