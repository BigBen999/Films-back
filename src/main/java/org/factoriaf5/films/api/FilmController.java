package org.factoriaf5.films.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.factoriaf5.films.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@RestController
@RequestMapping ("/api/v1/film")
@CrossOrigin(origins = "*")
public class FilmController {
    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("")
    public ResponseEntity<List<Film>> index() {
        return ResponseEntity.ok().body(filmService.findAll());
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<Film> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(filmService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok().body(filmService.delete(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Film stone) {
        return ResponseEntity.ok().body(filmService.create(film));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Film> update(@RequestBody Film stone, @PathVariable Long id) {
        return ResponseEntity.ok().body(filmService.update(film, id));
    }
}
