package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.model.Production;
import mk.finki.ukim.mk.lab.service.MovieService;
import mk.finki.ukim.mk.lab.service.ProductionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;
    private final ProductionService productionService;

    public MovieController(MovieService mService, ProductionService pService){
        this.movieService = mService;
        this.productionService = pService;
    }
    @GetMapping
    public String getMoviesPage(@RequestParam(required = false) String error, Model model){
        List<Movie> movies = this.movieService.listAll();
        model.addAttribute("movies",movies);
        return "listMovies";
    }
    @PostMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id){
        this.movieService.delete(id);
        return "redirect:/movies";
    }
    @GetMapping("/edit/{id}")
    public String editMovie(@PathVariable int id, Model model){
        if(this.movieService.findById(id).isPresent()){
            Movie m = this.movieService.findById(id).get();
            List<Production> productions = this.productionService.findAll();
            model.addAttribute("movie",m);
            model.addAttribute("productions",productions);
            model.addAttribute("bodyContent","add-movie");
            return "add-movie";
        }else{
            return "redirect:/movies";
        }
    }

    @GetMapping("/add-form")
    public String addMovie(Model model){
        List<Production> productions = this.productionService.findAll();
        model.addAttribute("productions",productions);
        model.addAttribute("bodyContent","add-movie");

        return "add-movie";
    }
    @PostMapping("/add")
    public String saveMovie(
            @RequestParam(required = false) String id,
            @RequestParam String title,
            @RequestParam String summary,
            @RequestParam Double rating,
            @RequestParam String prodName
    ){
        if(!id.isEmpty()){
            int x = Integer.parseInt(id);
            if(x!=0 && this.movieService.findById(x).isPresent()){
                this.movieService.delete(x);
            }
        }
        this.movieService.save(title,summary,rating,prodName);
        return "redirect:/movies";
    }
}
