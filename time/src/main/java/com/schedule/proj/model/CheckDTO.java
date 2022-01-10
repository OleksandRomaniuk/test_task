package com.schedule.proj.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CheckDTO {


    private Integer destinationId;

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public Integer getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(Integer baggageId) {
        this.baggageId = baggageId;
    }

    private Integer baggageId;




}
