package com.learn.kafka.demo.model;

import com.learn.kafka.demo.validator.annotation.CoordinatorFormatConstraint;
import com.learn.kafka.demo.validator.annotation.TaxiIdConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleSignal {

    @TaxiIdConstraint
    private String id;

    @CoordinatorFormatConstraint
    private Double latitude;

    @CoordinatorFormatConstraint
    private Double longitude;
}
