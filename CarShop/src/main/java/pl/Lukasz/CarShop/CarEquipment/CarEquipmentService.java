package pl.Lukasz.CarShop.CarEquipment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarEquipmentService {

    private final CarEquipmentRepository carEquipmentRepository;

}
