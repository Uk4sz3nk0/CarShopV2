package pl.Lukasz.CarShop.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Optional<Car> findById(@Param("id") Long id);

    List<Car> findByName(String name);

    List<Car> findByNameAndModel(String name, String model);

    Car save(Car car);
}
