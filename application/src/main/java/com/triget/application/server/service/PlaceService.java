package com.triget.application.server.service;

import com.triget.application.server.common.ObjectNotFoundException;
import com.triget.application.server.domain.journey.Place;
import com.triget.application.server.repository.journey.PlaceRepository;
import org.springframework.stereotype.Service;


@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public String getSearchName(String place) {
        return placeRepository.findByDisplayName(place).map(Place::getSearchName).orElseThrow(
                () -> new ObjectNotFoundException("No matching place found")
        );
    }
}
