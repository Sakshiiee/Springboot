package com.neosoft.SpringBootPagination.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Zwigato")
public class Zwigato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String restaurant;
    private String food;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Zwigato{" +
                "id=" + id +
                ", restaurant='" + restaurant + '\'' +
                ", food='" + food + '\'' +
                ", price=" + price +
                '}';
    }
}
