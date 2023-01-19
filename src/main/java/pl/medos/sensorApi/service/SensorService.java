package pl.medos.sensorApi.service;

import org.springframework.stereotype.Service;
import pl.medos.sensorApi.model.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class SensorService {

    private static final Logger LOGGER = Logger.getLogger(SensorService.class.getName());

    public List listAll() {
        return new ArrayList();

    }
    
    public void create(Sensor sensor) {

    }

    public void read(Long id) {

    }

    public void update(Sensor sensor) {

    }

    public void delete(Long id) {

    }
}
