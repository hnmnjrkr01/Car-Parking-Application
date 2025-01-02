package com.carprakingapp.webapp.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="parking_levels")
public class ParkingLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id")
    private Integer levelId;

    //---------One Parking-Level can have Many Bookings-------------

    @OneToMany(mappedBy = "parkingLevel", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Booking> bookings;

    //--------------------------------------------------------------


    @Column(name = "level_code")
    private Character levelCode;

    @Column(name = "max_capacity")
    private int MaximumCapacity;
}
