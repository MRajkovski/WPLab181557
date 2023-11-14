package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Production {
    private int id;
    private String name;
    private String country;
    private String address;

    public Production(String name, String country, String address) {
        this.id = (int)(Math.random() * 1000) + 11;
        this.name = name;
        this.country = country;
        this.address = address;
    }
}
