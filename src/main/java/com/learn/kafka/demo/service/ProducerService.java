package com.learn.kafka.demo.service;

import com.learn.kafka.demo.model.VehicleDistance;
import com.learn.kafka.demo.model.VehicleSignal;

public interface ProducerService {

    void sendSignalToKafkaTopic(VehicleSignal vehicleSignal);

    void sendDistanceToKafkaTopic(VehicleDistance vehicleDistance);
}
