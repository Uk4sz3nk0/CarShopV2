package pl.Lukasz.CarShop.Car;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.Lukasz.CarShop.Car.CarEnums.CarType;
import pl.Lukasz.CarShop.Car.CarEnums.FuelType;
import pl.Lukasz.CarShop.CarEquipment.CarEquipment;
import pl.Lukasz.CarShop.ExpandedCar.ExpandedCar;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;
    private String name;
    private String model;
    private String short_description;
    private int production_year;
    private int mileage;
    private int engine_capacity;
    private FuelType fuel_type;
    private String localization;
    private CarType car_type;
    private float price;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
    private ExpandedCar expandedCar;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
    private CarEquipment carEquipment;
}
