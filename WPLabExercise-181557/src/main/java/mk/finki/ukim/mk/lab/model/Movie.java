package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Movie {

    private int id;
    private String title;
    private String summary;
    private double rating;
    private Production production;

    public Movie(String title, String summary, double rating,Production production) {
        this.id = (int)(Math.random() * 1000) + 11;
        this.title = title;
        this.summary = summary;
        this.rating = rating;
        this.production = production;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
