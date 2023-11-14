package mk.finki.ukim.mk.lab.repository;

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

    public List<Movie> findAll(){
        return DataHolder.movies;
    }
    public List<Movie> searchMovies(String text){
        return DataHolder.movies.stream()
                .filter(p->p.getTitle().toLowerCase().contains(text.toLowerCase())
                        || p.getSummary().toLowerCase().contains(text.toLowerCase()))
                .toList();
    }
    public Optional<Movie> save(String title, String summary, double rating, String pName){
        Production p = DataHolder.productions.stream()
                .filter(c->c.getName().equals(pName)).findFirst().orElse(null);
        Movie m = new Movie(title,summary,rating,p);
        DataHolder.movies.removeIf(c -> c.getTitle().equalsIgnoreCase(title));
        DataHolder.movies.add(m);
        return Optional.of(m);
    }
    public Optional<Movie> findByName(String name){
        return DataHolder.movies.stream().filter(i->i.getTitle().equalsIgnoreCase(name)).findFirst();
    }
    public Optional<Movie> findById(int id){
        return DataHolder.movies.stream().filter(i->i.getId()==id).findFirst();
    }
    public void delete(int id){
        DataHolder.movies.removeIf(c->c.getId()==id);
    }


}
