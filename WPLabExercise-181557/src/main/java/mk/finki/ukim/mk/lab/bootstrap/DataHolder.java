package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.model.TicketOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Movie> movies = new ArrayList<>();

    @PostConstruct
    public void init(){
        movies.add(new Movie("Titanic","DESC-Titanic",9.00));
        movies.add(new Movie("LOTR:The Fellowship of the Ring","DESC-LOTR:The Fellowship of the Ring",10.00));
        movies.add(new Movie("LOTR:The Two Towers","DESC-LOTR:The Two Towers",10.00));
        movies.add(new Movie("LOTR:The Return of the King","DESC-LOTR:The Return of the King",10.00));
        movies.add(new Movie("The Shawshank Redemption","DESC-The Shawshank Redemption",9.00));
        movies.add(new Movie("Forrest Gump","DESC-Forrest Gump",80.00));
        movies.add(new Movie("Inception","DESC-Inception",10.00));
        movies.add(new Movie("The Silence of the Lambs","DESC-The Silence of the Lambs",9.00));
        movies.add(new Movie("Interstellar","DESC-Interstellar",10.00));
        movies.add(new Movie("Shutter Island","DESC-Shutter Island",10.00));
    }
}
