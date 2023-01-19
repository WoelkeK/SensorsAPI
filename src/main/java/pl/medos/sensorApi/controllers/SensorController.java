package pl.medos.sensorApi.controllers;

import org.springframework.web.bind.annotation.*;
import pl.medos.sensorApi.model.Sensor;
import pl.medos.sensorApi.service.SensorService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class SensorController {

    private static final Logger LOGGER = Logger.getLogger(SensorController.class.getName());

    private SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping("/test")
    public String apiTest() {
        LOGGER.info("test()");
        return "test ok! :Response 200";
    }

    @GetMapping("/sensors")
    public List allSensorsList() {
        LOGGER.info("allSensorsList()");
        List allSensors = sensorService.listAll();
        LOGGER.info("allSensorsList(...)");
        return allSensors;
    }

    @PostMapping("/sensor")
    public void createSensor(@RequestBody Sensor sensor) {
        LOGGER.info("createSensor(" + sensor + ")");
        sensorService.create(sensor);
        LOGGER.info("createSensor(...)");
    }

    @GetMapping("/sensor/{id}")
    public void readSensor(@PathVariable(name = "id") Long id) {
        LOGGER.info("readSensor(" + id + ")");
        sensorService.read(id);
        LOGGER.info("readSensor(...)");
    }

    @PatchMapping("/sensor")
    public void updateSensor(@RequestBody Sensor sensor) {
        LOGGER.info("updateSensor(" + sensor + ")");
        sensorService.update(sensor);
        LOGGER.info("updateSensor(...)");

    }

    @DeleteMapping("/sensor/{id}")
    public void deleteSensor(@PathVariable(name = "id") Long id) {
        LOGGER.info("deleteSensor(" + id + ")");
        sensorService.delete(id);
        LOGGER.info("deleteSensor(...)");

    }
}
