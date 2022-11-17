package com.learn.kafka.demo.service;

import com.learn.kafka.demo.model.VehicleSignal;

public interface ConsumerService {

     void consumer1(VehicleSignal vehicleSignal);

     void consumer2(VehicleSignal vehicleSignal);

     void consumer3(VehicleSignal vehicleSignal);
}
