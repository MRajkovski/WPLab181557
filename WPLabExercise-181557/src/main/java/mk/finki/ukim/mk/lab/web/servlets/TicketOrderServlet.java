//package mk.finki.ukim.mk.lab.web.servlets;
//
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import mk.finki.ukim.mk.lab.service.TicketOrderService;
//import org.thymeleaf.context.WebContext;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.web.IWebExchange;
//import org.thymeleaf.web.servlet.JakartaServletWebApplication;
//
//import java.io.IOException;
//
//@WebServlet(name="ticket-order-servlet",urlPatterns = {"/ticketOrder"})
//public class TicketOrderServlet extends HttpServlet {
//
//   /* private final SpringTemplateEngine springTemplateEngine;
//    private final TicketOrderService ticketOrderService;
//
//    public TicketOrderServlet(SpringTemplateEngine stEngine,TicketOrderService tService){
//        this.springTemplateEngine = stEngine;
//        this.ticketOrderService = tService;
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        IWebExchange webExchange = JakartaServletWebApplication
//                .buildApplication(getServletContext())
//                .buildExchange(req, resp);
//        WebContext context = new WebContext(webExchange);
//        context.setVariable("userIp",req.getRemoteAddr());
//        context.setVariable("cName",req.getHeader("User-Agent"));
//        context.setVariable("title",req.getParameter("title"));
//        context.setVariable("tickets",req.getParameter("numTickets"));
//        this.springTemplateEngine.process("orderConfirmation.html",context,resp.getWriter());
//    }*/
//
//
//}
