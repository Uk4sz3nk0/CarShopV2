package pl.Lukasz.CarShop.Car;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;


    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findByName(String name) {
        return carRepository.findByName(name);
    }

    public List<Car> findByNameAndModel(String name, String model) {
        return carRepository.findByNameAndModel(name, model);
    }
}
