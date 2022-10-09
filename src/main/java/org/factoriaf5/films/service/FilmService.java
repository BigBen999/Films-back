package org.factoriaf5.films.service;
import org.factoriaf5.films.exceptions.StoneNotFoundException;
import org.factoriaf5.films.payload.request.FilmRequest;
import org.factoriaf5.films.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.factoriaf5.films.entity.film;

import java.util.List;
import java.util.Optional;



@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Film findById(Long id) {
        return filmRepository.findById(id).get();
    }

    public Long delete(Long id) {
//        if(filmRepository.findById(id).isEmpty()){
//            throw new FilmNotFoundException();
//        }
        filmRepository.findById(id).orElseThrow(FilmNotFoundException::new);
        filmRepository.deleteById(id);
        return id;
    }


    public Film update(Film film, Long id) {
        Optional<Film> filmUpdate = filmRepository.findById(id);
        if (filmUpdate.isPresent()){
            Film _film = filmUpdate.get();
            _film.setName(film.getName());
            _film.setColor(film.getColor());
            _film.setAttributes(film.getAttributes());
            _film.setHealing(film.getHealing());
            _film.setPosition(film.getPosition());
            _film.setImage(film.getImage());

            return filmRepository.save(_film);
        }
        throw new RuntimeException("Film not found");
    }



    public Film create(Film film) {
        return filmRepository.save(film);
    }
}