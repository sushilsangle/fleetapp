package com.sushils.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "vehicletypeid", insertable = false, updatable = false)
    private VehicleType vehicleType;
    private Integer vehicletypeid;

    private String vehicleNumber;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date registrationDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "vehiclemakeid", insertable = false, updatable = false)
    private VehicleMake vehicleMake;
    private VehicleMake vehiclemakeid;

    private String power;
    private String fuelCapacity;

    @ManyToOne
    @JoinColumn(name = "vehiclestatusid", insertable = false, updatable = false)
    private VehicleStatus vehicleStatus;
    private Integer vehiclestatusid;

    private String netWeight;
    @ManyToOne
    @JoinColumn(name = "employeeid", insertable = false, updatable = false)
    private Employee inCharge;
    private Integer employeeid;

    @ManyToOne
    @JoinColumn(name = "vehiclemodelid", insertable = false, updatable = false)
    private VehicleModel vehicleMmodel;
    private Integer vehiclemodelid;

    @ManyToOne
    @JoinColumn(name = "locationid", insertable = false, updatable = false)
    private Location currentLocation;
    private Integer locationid;

    private String remarks;
}
