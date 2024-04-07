package com.htdweb.building.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product_images")
public class product_images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="image")
    private String image;
    //


}
