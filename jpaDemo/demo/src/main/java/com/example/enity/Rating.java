package com.example.enity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Table(name = "product_ratings", schema = "product")
@Getter
@Setter
public class Rating {

    @Id
    @GeneratedValue
    @Column(name="rating_id")
    private Long ratingId;

    private double rating;

    @Column(name="product_id")
    private String productId;

    @Column(name="user_id")
    private String userId;

    public Rating() {
    }
    public Rating(Long ratingId, double rating, String productId, String userId) {
        super();
        this.ratingId = ratingId;
        this.rating = rating;
        this.productId = productId;
        this.userId = userId;
    }
}
