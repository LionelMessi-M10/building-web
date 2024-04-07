package com.htdweb.building.entity;

import jakarta.persistence.*;

@Entity
@Table(name="building_coupon")
public class building_coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="building_id")
    private int building_id;
    @Column(name="coupon_id")
    private int coupon_id;

}
