package org.factoriaf5.films.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "stone not found")

public class FilmNotFoundException extends RuntimeException {
}
