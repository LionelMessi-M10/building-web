package com.htdweb.building.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="building_categories")
public class building_categories {
    private int id;
    private int building_id;
    private int category_id;
}
