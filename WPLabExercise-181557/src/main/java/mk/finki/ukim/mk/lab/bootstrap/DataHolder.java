package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import mk.finki.ukim.mk.lab.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Movie> movies = new ArrayList<>();
    public static List<Production> productions = new ArrayList<>();
    public static List<User> users= new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts= new ArrayList<>();
    public static List<TicketOrder> ticketOrders= new ArrayList<>();
    @PostConstruct
    public void init(){
        productions.add(new Production("Dreamworks","US","New York"));
        productions.add(new Production("Columbia","US","Utah"));
        productions.add(new Production("Warner Bros","US","Texas"));
        productions.add(new Production("New Line Cinema","US","California"));
        productions.add(new Production("Universal","US","Minnesota"));
        movies.add(new Movie("Titanic","DESC-Titanic",9.00,productions.stream()
                .filter(p->p.getName().equals("Dreamworks")).findFirst().orElse(null)));
        movies.add(new Movie("LOTR:The Fellowship of the Ring","DESC-LOTR:The Fellowship of the Ring",10.00,productions.stream()
                .filter(p->p.getName().equals("New Line Cinema")).findFirst().orElse(null)));
        movies.add(new Movie("LOTR:The Two Towers","DESC-LOTR:The Two Towers",10.00,productions.stream()
                .filter(p->p.getName().equals("New Line Cinema")).findFirst().orElse(null)));
        movies.add(new Movie("LOTR:The Return of the King","DESC-LOTR:The Return of the King",10.00,productions.stream()
                .filter(p->p.getName().equals("New Line Cinema")).findFirst().orElse(null)));
        movies.add(new Movie("The Shawshank Redemption","DESC-The Shawshank Redemption",9.00,productions.stream()
                .filter(p->p.getName().equals("Dreamworks")).findFirst().orElse(null)));
        movies.add(new Movie("Forrest Gump","DESC-Forrest Gump",8.00,productions.stream()
                .filter(p->p.getName().equals("Universal")).findFirst().orElse(null)));
        movies.add(new Movie("Inception","DESC-Inception",10.00,productions.stream()
                .filter(p->p.getName().equals("Warner Bros")).findFirst().orElse(null)));
        movies.add(new Movie("The Silence of the Lambs","DESC-The Silence of the Lambs",9.00,productions.stream()
                .filter(p->p.getName().equals("Columbia")).findFirst().orElse(null)));
        movies.add(new Movie("Interstellar","DESC-Interstellar",10.00,productions.stream()
                .filter(p->p.getName().equals("Universal")).findFirst().orElse(null)));
        movies.add(new Movie("Shutter Island","DESC-Shutter Island",10.00,productions.stream()
                .filter(p->p.getName().equals("Warner Bros")).findFirst().orElse(null)));

    }
}
