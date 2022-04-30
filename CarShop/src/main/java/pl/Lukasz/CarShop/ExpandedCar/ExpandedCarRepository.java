package pl.Lukasz.CarShop.ExpandedCar;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpandedCarRepository extends JpaRepository<ExpandedCar, Long> {

}
