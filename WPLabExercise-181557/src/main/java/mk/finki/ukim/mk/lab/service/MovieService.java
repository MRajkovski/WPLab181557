package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> listAll();
    List<Movie> searchMovies(String text);

    Optional<Movie> save(String title,String summary,double rating,String pName);

    void delete(int id);

    Optional<Movie> findById(int id);
    Optional<Movie> findByName(String name);
}
