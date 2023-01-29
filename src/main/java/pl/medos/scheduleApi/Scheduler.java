package pl.medos.scheduleApi;

import pl.medos.SparePartApi.SparePart;
import pl.medos.machineApi.model.Machine;
import pl.medos.stockApi.Stock;

import java.time.LocalDate;

public class Scheduler {

    private Machine machine;
    private LocalDate lastService;
    private LocalDate plannedService;
    private Stock stock;
    private SparePart sparePart;
}
