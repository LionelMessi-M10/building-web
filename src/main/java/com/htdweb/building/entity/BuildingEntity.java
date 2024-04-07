package com.htdweb.building.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "buildings")
public class BuildingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "building_name")
    private String buildingName;
    @Column(name = "address")
    private String address;
    @Column(name = "area")
    private String area;
    @Column(name = "bed_room")
    private String bedRoom;
    @Column(name = "bath_room")
    private String bathRoom;
    @Column(name = "year_build")
    private Date yearBuild;
    @Column(name = "price")
    private Double price;
    @Column(name = "image")
    private String image;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;

    public Long getId() {
        return id;
    }
    @OneToMany(mappedBy = "buildingEntity", fetch = FetchType.LAZY)
    private List<ProductImagesEntity> listProductImages;

}
