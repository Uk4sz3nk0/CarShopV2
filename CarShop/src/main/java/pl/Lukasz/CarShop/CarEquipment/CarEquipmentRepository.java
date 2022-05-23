package pl.Lukasz.CarShop.CarEquipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CarEquipmentRepository extends JpaRepository<CarEquipment, Long> {

    Optional<CarEquipment> findById(@Param("id") Long id);
}
