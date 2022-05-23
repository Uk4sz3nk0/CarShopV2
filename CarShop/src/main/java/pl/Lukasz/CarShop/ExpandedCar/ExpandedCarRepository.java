package pl.Lukasz.CarShop.ExpandedCar;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpandedCarRepository extends JpaRepository<ExpandedCar, Long> {

    Optional<ExpandedCar> findById(@Param("id") Long id);
}
