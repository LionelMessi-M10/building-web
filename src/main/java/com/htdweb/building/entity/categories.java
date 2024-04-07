package com.htdweb.building.entity;

import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="code")
    private String code;
    @Column(name="name")
    private String name;
    @Column(name="status")
    private int status;
}

