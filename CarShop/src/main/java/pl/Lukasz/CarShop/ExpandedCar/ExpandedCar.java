package pl.Lukasz.CarShop.ExpandedCar;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.Lukasz.CarShop.Car.Car;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name="expandedcar")
public class ExpandedCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expandedCar_id;
    private String who;
    private String version;
    private String generation;
    private String vin_number;
    private int power;
    private String gear_box;
    private String wheel_drive_type;
    private float fuel_usage_city;
    private float fuel_usage_route;
    private float fuel_usage_mid;
    private int doors;
    private int seats;
    private String color;
    private String car_condition;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Car car;

}
