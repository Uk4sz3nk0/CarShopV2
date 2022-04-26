package pl.Lukasz.CarShop.Car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping("/carbyid/{id}")
    public Optional<Car> findById(@PathVariable Long id){
        return carService.findById(id);
    }

    @GetMapping
    public List<Car> findAll(){
        return carService.findAll();
    }

    @GetMapping("/{name}")
    public List<Car> findByName(@PathVariable String name){
        return carService.findByName(name);
    }

    @GetMapping("/{name}/{model}")
    public List<Car> findByNameAndModel(@PathVariable String name, @PathVariable String model){
        return carService.findByNameAndModel(name, model);
    }
}

