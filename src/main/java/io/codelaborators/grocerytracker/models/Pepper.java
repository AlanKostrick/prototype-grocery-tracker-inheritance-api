package io.codelaborators.grocerytracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pepper extends Perishable {

    @Id
    @GeneratedValue
    private Long id;

    public Pepper(){}

    public Long getId(){
        return id;
    }

    public Pepper(String name, double price, int quantity, int daysToExpiration) {
        super(name, price, quantity, daysToExpiration);
    }

}