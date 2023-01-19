package pl.medos.sensorApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medos.sensorApi.model.Sensor;
@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
