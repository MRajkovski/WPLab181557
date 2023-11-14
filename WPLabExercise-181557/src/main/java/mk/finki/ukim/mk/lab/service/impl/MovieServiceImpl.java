package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.repository.MovieRepository;
import mk.finki.ukim.mk.lab.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository mRepository){
        this.movieRepository = mRepository;
    }
    @Override
    public List<Movie> listAll() {
        return this.movieRepository.findAll();
    }

    @Override
    public Optional<Movie> save(String title, String summary, double rating, String pName) {
        return this.movieRepository.save(title,summary,rating,pName);

    }
    @Override
    public List<Movie> searchMovies(String text) {
        return this.movieRepository.searchMovies(text);
}

    @Override
    public Optional<Movie> findById(int id) {
        return this.movieRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        this.movieRepository.delete(id);
    }

    @Override
    public Optional<Movie> findByName(String name) {
        return this.movieRepository.findByName(name);
    }

}
