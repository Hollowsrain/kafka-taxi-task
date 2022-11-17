package com.learn.kafka.demo.service.Impl;

import com.learn.kafka.demo.model.VehicleDistance;
import com.learn.kafka.demo.model.VehicleSignal;
import com.learn.kafka.demo.service.ProducerService;
import com.learn.kafka.demo.util.VehicleSignalUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VehicleSignalProducerService implements ProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${kafka.topic.signal.name}")
    private String signalTopic;

    @Value("${kafka.topic.distance.name}")
    private String distanceTopic;

    @Override
    public void sendSignalToKafkaTopic(VehicleSignal vehicleSignal) {
        log.info("Signal sent to Topic");
        VehicleSignalUtils.saveIfAbsent(vehicleSignal);
        this.kafkaTemplate.send( signalTopic, vehicleSignal.getId(), vehicleSignal);
    }

    @Override
    public void sendDistanceToKafkaTopic(VehicleDistance vehicleDistance) {
        log.info("Distance sent to Topic");
        VehicleSignalUtils.saveIfAbsent(vehicleDistance);
        this.kafkaTemplate.send( distanceTopic, vehicleDistance.getId(), vehicleDistance);
    }
}
