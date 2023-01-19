package pl.medos.sensorApi.service;

import org.springframework.stereotype.Service;
import pl.medos.sensorApi.model.Sensor;
import pl.medos.sensorApi.repository.SensorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class SensorService {

    private static final Logger LOGGER = Logger.getLogger(SensorService.class.getName());

    private SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List listAll() {
        LOGGER.info("()");
        return new ArrayList();

    }

    public Sensor create(Sensor sensor) {
        LOGGER.info("create(" + sensor + ")");
        Sensor createdSensor = sensorRepository.save(sensor);
        LOGGER.info("create(...)");
        return createdSensor;

    }

    public Sensor read(Long id) {
        LOGGER.info("read()");
        Sensor readedSensor = sensorRepository.findById(id).orElseThrow();
        LOGGER.info("read(...)");
        return readedSensor;

    }

    public Sensor update(Sensor sensor) {
        LOGGER.info("update()");
        Sensor updatedSensor = sensorRepository.findById(sensor.getId()).orElseThrow();
        LOGGER.info("update(...)");
        return updatedSensor;
    }

    public String delete(Long id) {
        LOGGER.info("delete()");
        sensorRepository.deleteById(id);
        LOGGER.info("delete(...)");
        return "Record " + id + " deleted!";
    }
}
