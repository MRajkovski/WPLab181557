package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    public List<Movie> findAll(){
        return DataHolder.movies;
    }
    public List<Movie> searchMovies(String text){
        return DataHolder.movies.stream()
                .filter(p->p.getTitle().toLowerCase().contains(text.toLowerCase())
                        || p.getSummary().toLowerCase().contains(text.toLowerCase()))
                .toList();
    }
}
