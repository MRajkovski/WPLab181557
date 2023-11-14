package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.service.TicketOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ticketOrder")
public class TicketOrderController {
    private final TicketOrderService ticketOrderService;

    public TicketOrderController(TicketOrderService tService){
        this.ticketOrderService = tService;
    }

    @GetMapping()
    public String createOrder(@RequestParam String title, Model model){

        System.out.println("TEST");
        model.addAttribute("title",title);

        return "orderConfirmation";
    }

}
