package pl.Lukasz.CarShop.CarEquipment;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "carequipment")
public class CarEquipment {

    @Id
    private Long id;
    private boolean abs;
    private boolean asr;
    private boolean bluetooth;
    private boolean rain_sensor;
    private boolean front_parking_sensor;
    private boolean electrochromic_mirrors;
    private boolean electric_rear_windows;
    private boolean esp;
    private boolean usb;
    private boolean immobiliser;
    private boolean automatic_air_conditioning;
    private boolean manual_air_conditioning;
    private boolean gearshift_paddles;
    private boolean dvd_player;
    private boolean heated_windscreen;
    private boolean heated_rear_seats;
    private boolean passenger_airbag;
    private boolean tinted_windows;
    private boolean adjustable_suspension;
    private boolean sunroof;
    private boolean fog_lights;
    private boolean velor;
    private boolean tv_tuner;
    private boolean cd_player;
    private boolean alarm;
    private boolean parking_assistant;
    private boolean cd;
    private boolean blind_spot_sensor;
    private boolean rear_parking_sensor;
    private boolean electrochromic_reverse_mirror;
    private boolean electrochromic_seats_setting;
    private boolean aux_socket;
    private boolean car_hook;
    private boolean isofix;
    private boolean four_zone_air_conditioning;
    private boolean on_board_computer;
    private boolean mp3_player;
    private boolean speed_limiter;
    private boolean heated_side_mirrors;
    private boolean knee_airbag;
    private boolean front_side_airbags;
    private boolean factory_radio;
    private boolean roof_rails;
    private boolean day_lights;
    private boolean xenon_lights;
    private boolean cruise_control;
    private boolean multifunction_steering_wheel;
    private boolean lane_assistant;
    private boolean central_lock;
    private boolean dusk_sensor;
    private boolean panoramic_roof;
    private boolean electric_front_windows;
    private boolean electric_mirrors;
    private boolean sd_socket;
    private boolean head_up_display;
    private boolean rear_view_camera;
    private boolean two_zone_air_conditioning;
    private boolean air_curtains;
    private boolean gps_navi;
    private boolean webasto;
    private boolean heated_front_seats;
    private boolean rear_side_airbags;
    private boolean non_factory_radio;
    private boolean start_stop_system;
    private boolean led_lights;
    private boolean leather_upholstery;
    private boolean active_cruise_control;
    private boolean power_steering;


}
