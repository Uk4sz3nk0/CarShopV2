package pl.Lukasz.CarShop.Car;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String model;
    private String short_description;
    private int production_year;
    private int mileage;
    private int engine_capacity;
    private String fuel_type;
    private String localization;
    private String car_type;
    private float price;
}
