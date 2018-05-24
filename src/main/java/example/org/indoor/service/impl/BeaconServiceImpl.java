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

    @Autowired
    private BeaconDAO beaconDAO;

    @Transactional
    public Integer create(Beacon role) {
        return beaconDAO.create(role);
    }

    @Transactional
    public Beacon find(Integer id) {
        return beaconDAO.find(id);
    }

    @Transactional
    public void update(Beacon role) {
        beaconDAO.update(role);
    }

    @Transactional
    public void delete(Integer id) {
        beaconDAO.delete(id);
    }

    @Transactional
    public List<Beacon> readAll() {
        return beaconDAO.readAll();
    }
}
