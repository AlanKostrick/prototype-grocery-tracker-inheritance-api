package io.codelaborators.grocerytracker.models;

import io.codelaborators.grocerytracker.GroceryItem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Perishable extends GroceryItem {

    @Id
    @GeneratedValue
    protected Long id;

    protected int daysToExpiration;

    public Perishable(){}

    public int getDaysToExpiration() {
        return daysToExpiration;
    }

    public Perishable(String name, double price, int quantity, int daysToExpiration) {
        super(name, price, quantity);
        this.daysToExpiration = daysToExpiration;
    }

    public double calculateTotalPrice() {
        if(daysToExpiration <=2){
            return .50 * (price* quantity);
        }
        return price * quantity;
    }

}