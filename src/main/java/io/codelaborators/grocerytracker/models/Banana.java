package io.codelaborators.grocerytracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Banana extends Perishable {

    @Id
    @GeneratedValue
    private Long id;

    public Banana(){}

    public Long getId(){
        return id;
    }

    public Banana(String name, double price, int quantity, int daysToExpiration) {
        super(name, price, quantity, daysToExpiration);
    }

}