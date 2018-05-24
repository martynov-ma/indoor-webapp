package example.org.indoor.service;

import example.org.indoor.entity.Beacon;

import java.util.List;

public interface BeaconService {
    Integer create(Beacon role);
    Beacon find(Integer id);
    void update(Beacon role);
    void delete(Integer id);
    List<Beacon> readAll();
}
