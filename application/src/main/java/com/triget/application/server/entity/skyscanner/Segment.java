package com.triget.application.server.entity.skyscanner;

import lombok.Getter;

@Getter
public class Segment {
    private String id;
    private TmpObject origin;
    private TmpObject destination;
    private String departure;
    private String arrival;
    private int durationInMinutes;
    private String flightNumber;
    private Operation operatingCarrier;
}
