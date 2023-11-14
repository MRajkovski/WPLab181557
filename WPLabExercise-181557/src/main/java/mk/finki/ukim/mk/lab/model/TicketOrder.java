package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class TicketOrder {

    private Long numberOfTickets;
    private String movieTitle;
    private String clientName;
    private String clientAddress;

    public TicketOrder(Long numberOfTickets, String movieTitle, String clientName, String clientAddress) {
        this.numberOfTickets = numberOfTickets;
        this.movieTitle = movieTitle;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
    }

    public Long getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
}
