package com.htdweb.building.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="buildings")
public class buildings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private  String building_name;
    @Column(name="address")
    private  String address;
    @Column(name="area")
    private int area;
    @Column(name="bed_room")
    private int bed_room;
    @Column(name="bath_room")
    private int bath_room;
    @Column(name="year_build")
    private Date year_build;
    @Column(name="price")
    private float price;
    @Column(name="image")
    private String image;
    @Column(name="short_description")
    private String short_description;
    @Column(name="description")
    private String description;
    @Column(name="status")
    private int status;
    //
    @ManyToOne
    @JoinColumn()
    private int image_id;

}
