package pl.Lukasz.CarShop.CarEquipment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarEquipmentController {

    private final CarEquipmentService carEquipmentService;

}
