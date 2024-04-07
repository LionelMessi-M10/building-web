package com.htdweb.building.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coupons")
@Setter
@Getter

public class CouponsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "discount_value")
    private Double discountValue;
    @Column(name = "code")
    private String code;
    @Column(name = "coupon_description")
    private String couponDescription;
    @Column(name = "coupon_start_date")
    private Date couponStartDate;
    @Column(name = "coupon_end_date")
    private Date couponEndDate;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modi_date")
    private Date couponStartDate1;

}
