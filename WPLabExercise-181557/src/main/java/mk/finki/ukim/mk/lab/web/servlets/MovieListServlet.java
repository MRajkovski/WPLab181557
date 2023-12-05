//package mk.finki.ukim.mk.lab.web.servlets;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import mk.finki.ukim.mk.lab.service.MovieService;
//import org.thymeleaf.context.WebContext;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.web.IWebExchange;
//import org.thymeleaf.web.servlet.JakartaServletWebApplication;
//
//import java.io.IOException;
//
//@WebServlet(name="movie-list-servlet",urlPatterns = {""})
//public class MovieListServlet extends HttpServlet {
//
//   /* private final SpringTemplateEngine springTemplateEngine;
//    private final MovieService movieService;
//
//    public MovieListServlet(MovieService mService,SpringTemplateEngine stEngine){
//        this.movieService = mService;
//        this.springTemplateEngine = stEngine;
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        IWebExchange webExchange = JakartaServletWebApplication
//                .buildApplication(getServletContext())
//                .buildExchange(req, resp);
//
//        WebContext context = new WebContext(webExchange);
//        String searchFilter = req.getParameter("title");
//        if(searchFilter!=null && !searchFilter.isEmpty()){
//            context.setVariable("movies",this.movieService.searchMovies(searchFilter));
//        }else{
//            context.setVariable("movies",this.movieService.listAll());
//        }
//
//        this.springTemplateEngine.process("listMovies.html",context,resp.getWriter());
//    }
//*/
//
//}
