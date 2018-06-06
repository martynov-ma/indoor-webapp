package example.org.indoor.dao;

import example.org.indoor.entity.Beacon;

import java.util.List;

public interface BeaconDAO extends GenericDAO<Beacon, Integer>  {

    List<Beacon> findAllByFloorNum(Integer floorNum);

    Beacon findByName(String beaconName);
}
