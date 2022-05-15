package pl.Lukasz.CarShop.CarEquipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarEquipmentRepository extends JpaRepository<Long, CarEquipment> {

}
