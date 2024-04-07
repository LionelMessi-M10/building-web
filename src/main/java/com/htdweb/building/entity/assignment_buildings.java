package com.htdweb.building.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="assignment_buildings")
public class assignment_buildings {
    private int id;
    private int staff_id;
    private int building_id;
    private Date created_at;
    private Date modified_at;

}
