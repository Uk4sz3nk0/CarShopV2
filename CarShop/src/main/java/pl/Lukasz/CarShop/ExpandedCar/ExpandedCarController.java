package pl.Lukasz.CarShop.ExpandedCar;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class ExpandedCarController {

    private final ExpandedCarService expandedCarService;

    @GetMapping("/car/{id}")
    public ResponseEntity<ExpandedCar> findById(@PathVariable Long id){
        return expandedCarService.findById(id).
                map(ResponseEntity::ok).
                orElse(ResponseEntity.notFound().build());
    }

}
