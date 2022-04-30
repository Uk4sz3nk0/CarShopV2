package pl.Lukasz.CarShop.ExpandedCar;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpandedCarService {


    private final ExpandedCarRepository expandedCarRepository;

    public Optional<ExpandedCar> findById(Long id){
        return expandedCarRepository.findById(id);
    }
}
