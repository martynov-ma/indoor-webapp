package example.org.indoor.service.impl;

import example.org.indoor.dao.BeaconDAO;
import example.org.indoor.entity.Beacon;
import example.org.indoor.service.BeaconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BeaconServiceImpl implements BeaconService {

    private final BeaconDAO beaconDAO;

    @Autowired
    public BeaconServiceImpl(BeaconDAO beaconDAO) {
        this.beaconDAO = beaconDAO;
    }

    @Transactional
    public Integer create(Beacon beacon) {
        return beaconDAO.create(beacon);
    }

    @Transactional
    public Beacon find(Integer id) {
        return beaconDAO.find(id);
    }

    @Transactional
    public void update(Beacon beacon) {
        beaconDAO.update(beacon);
    }

    @Transactional
    public void delete(Integer id) {
        beaconDAO.delete(id);
    }

    @Transactional
    public List<Beacon> readAll() {
        return beaconDAO.readAll();
    }

    @Override
    public List<Beacon> readAllByFloorNum(Integer floorNum) {
        return beaconDAO.findAllByFloorNum(floorNum);
    }
}
