package com.neosoft.SpringBootSorting.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String actor;
    private String platform;
    private String genre;
    private double time;
    private double rating;
    private boolean isavailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return (int) time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", platform='" + platform + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", rating=" + rating +
                ", isavailable=" + isavailable +
                '}';
    }
}
