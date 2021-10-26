package com.sebpud.demo.enitity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    private Long id;
    private String hotelName;
    private String img;
    private String price;
    private Long rating;

    public Hotel(Long id, String hotelName, String img, String price, Long rating) {
        this.id = id;
        this.hotelName = hotelName;
        this.img = img;
        this.price = price;
        this.rating = rating;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}

