package com.triget.application.server.domain.product.flight;

import com.mongodb.lang.Nullable;
import com.triget.application.server.domain.airline.Airline;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "flight")
public class FlightLeg {
    @Field("skyscanner_id")
    private String skyScannerId;
    private String origin;
    private String destination;
    @Field("departure_time")
    private String departure;
    @Field("arrival_time")
    private String arrival;
    @Field("duration_in_minutes")
    private int durationInMinutes;
    @Field("time_delta_in_days")
    private int timeDeltaInDays;
    @Field("stop_count")
    private int stopCount;
    @Nullable
    @Field("is_smallest_stops")
    private Boolean isSmallestStops;
    private List<Airline> operations;
    @Nullable
    @Field("airport_change_in")
    private List<String> airportChangeIn;
    @Nullable
    private List<FlightSegment> segments;

    @Builder
    public FlightLeg(String skyScannerId, String origin, String destination, String departure,
                     String arrival, int durationInMinutes, int timeDeltaInDays, int stopCount,
                     @Nullable Boolean isSmallestStops, List<Airline> operations, @Nullable List<String> airportChangeIn,
                     @Nullable List<FlightSegment> segments)
    {
        this.skyScannerId = skyScannerId;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.durationInMinutes = durationInMinutes;
        this.timeDeltaInDays = timeDeltaInDays;
        this.stopCount = stopCount;
        this.isSmallestStops = isSmallestStops;
        this.operations = operations;
        this.airportChangeIn = airportChangeIn;
        this.segments = segments;
    }
}
