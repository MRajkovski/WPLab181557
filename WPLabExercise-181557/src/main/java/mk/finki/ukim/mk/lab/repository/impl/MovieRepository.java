package mk.finki.ukim.mk.lab.repository.impl;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.model.Production;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {
    public List<Movie> findAll() {
        return DataHolder.movies;
    }
    public Optional<Movie> findById(Long id) {
        return DataHolder.movies.stream()
                .filter(movie -> movie.getId().equals(id)).findFirst();
    }
    public Optional<Movie> findByName(String name){
        return DataHolder.movies.stream().filter(movie -> movie.getTitle().equals(name)).findFirst();
    }
    public void deleteById(Long id) {
        DataHolder.movies.removeIf(movie -> movie.getId().equals(id));
    }

    public Optional<Movie> save(String title, String summary, double rating, Production production) {
        DataHolder.movies.removeIf(movie -> movie.getTitle().equals(title));
        Movie movie=new Movie(title,summary,rating,production);
        DataHolder.movies.add(movie);
        return Optional.of(movie);
    }

}