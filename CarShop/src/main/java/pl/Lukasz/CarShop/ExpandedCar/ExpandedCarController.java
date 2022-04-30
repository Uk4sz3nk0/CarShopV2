package pl.Lukasz.CarShop.ExpandedCar;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/carbyid")
public class ExpandedCarController {

    private final ExpandedCarService expandedCarService;

    @GetMapping("/{id}")
    public Optional<ExpandedCar> findById(@PathVariable Long id){
        return expandedCarService.findById(id);
    }

}
