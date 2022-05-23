package pl.Lukasz.CarShop.CarEquipment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarEquipmentService {

    private final CarEquipmentRepository carEquipmentRepository;

    public Optional<CarEquipment> findById(Long id) {
        return carEquipmentRepository.findById(id);
    }
}
