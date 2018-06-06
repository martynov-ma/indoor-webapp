package example.org.indoor.service.impl;

import example.org.indoor.dao.BeaconDAO;
import example.org.indoor.dao.UserLocationDAO;
import example.org.indoor.entity.Beacon;
import example.org.indoor.entity.UserLocation;
import example.org.indoor.entity.dto.UserLocationDto;
import example.org.indoor.service.UserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserLocationServiceImpl implements UserLocationService {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    private final BeaconDAO beaconDAO;
    private final UserLocationDAO userLocationDAO;

    @Autowired
    public UserLocationServiceImpl(BeaconDAO beaconDAO, UserLocationDAO userLocationDAO) {
        this.beaconDAO = beaconDAO;
        this.userLocationDAO = userLocationDAO;
    }

    @Transactional
    public UserLocationDto findLocation(List<String> beaconNames) {
        List<Beacon> beacons = new ArrayList<>();
        for (String beaconName : beaconNames) {
            beacons.add(beaconDAO.findByName(beaconName));
        }

        Integer maxCordx = beacons.get(0).getCordx(), minCordx = beacons.get(0).getCordx();
        Integer maxCordy = beacons.get(0).getCordy(), minCordy = beacons.get(0).getCordy();
        for (Beacon beacon : beacons) {
            if (beacon.getCordx() > maxCordx) maxCordx = beacon.getCordx();
            else if (beacon.getCordx() < minCordx) minCordx = beacon.getCordx();
            if (beacon.getCordy() > maxCordy) maxCordy = beacon.getCordy();
            else if (beacon.getCordy() < minCordy) minCordy = beacon.getCordy();
        }

        Integer cordx = minCordx + Math.round((maxCordx - minCordx) / 2);
        Integer cordy = minCordy + Math.round((maxCordy - minCordy) / 2);

        UserLocation userLocation = new UserLocation(beacons.get(0).getFloorNum(), cordx, cordy, dateFormat.format(new Date()));
        userLocationDAO.create(userLocation);
        return new UserLocationDto(userLocation.getFloorNum(), userLocation.getCordx(), userLocation.getCordy());
    }

    @Override
    public List<UserLocation> readAll() {
        return userLocationDAO.readAll();
    }
}
