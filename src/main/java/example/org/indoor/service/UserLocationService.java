package example.org.indoor.service;

import example.org.indoor.entity.dto.UserLocationDto;

import java.util.List;

public interface UserLocationService {
    UserLocationDto findLocation(List<String> beaconNames);
}
