package pl.Lukasz.CarShop.CarEquipment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarEquipmentController {

    private final CarEquipmentService carEquipmentService;

    @GetMapping("/{id}")
    public ResponseEntity<CarEquipment> findById(@PathVariable Long id) {
        return carEquipmentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
