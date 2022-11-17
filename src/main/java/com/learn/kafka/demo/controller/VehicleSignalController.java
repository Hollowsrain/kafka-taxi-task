package com.learn.kafka.demo.controller;

import com.learn.kafka.demo.model.VehicleSignal;
import com.learn.kafka.demo.service.ProducerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping(value = "/vehicle")
@RestController
public class VehicleSignalController {

    private final ProducerService vehicleSignalService;

    public VehicleSignalController(ProducerService vehicleSignalService) {
        this.vehicleSignalService = vehicleSignalService;
    }

    @RequestMapping(value = "/send-signal")
    public void vehicleSignal(@Valid @RequestBody VehicleSignal vehicleSignal) {
        vehicleSignalService.sendSignalToKafkaTopic(vehicleSignal);
    }

}
