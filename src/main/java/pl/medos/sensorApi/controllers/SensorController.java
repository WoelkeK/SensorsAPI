package pl.medos.sensorApi.controllers;

import org.springframework.web.bind.annotation.*;
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
    public List allSensorsList(){
        List allSensors = sensorService.listAll();
        return allSensors;
    }

    @PostMapping("/sensor")
    public void createSensor(){

    }
    @GetMapping("/sensor/id")
    public void readSensor(){


    }
    @PatchMapping("/sensor")
    public void updateSensor(){

    }
    @DeleteMapping("/sensor/id")
    public void deleteSensor(){

    }
}
