package pl.Lukasz.CarShop.ExpandedCar;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name="expcar")
public class ExpandedCar {

    @Id
    private Long id;
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
    private String condition;

}
