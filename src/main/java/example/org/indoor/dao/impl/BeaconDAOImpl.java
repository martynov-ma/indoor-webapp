package example.org.indoor.dao.impl;

import example.org.indoor.dao.BeaconDAO;
import example.org.indoor.entity.Beacon;
import org.springframework.stereotype.Repository;

@Repository
public class BeaconDAOImpl extends GenericDAOImpl<Beacon, Integer> implements BeaconDAO {

}
