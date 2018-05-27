package example.org.indoor.dao.impl;

import example.org.indoor.dao.BeaconDAO;
import example.org.indoor.entity.Beacon;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class BeaconDAOImpl extends GenericDAOImpl<Beacon, Integer> implements BeaconDAO {

    @Override
    public List<Beacon> findAllByFloorNum(Integer floorNum) {
        Query query = entityManager.createQuery("from Beacon where floorNum = :floorNum");
        query.setParameter("floorNum", floorNum);
        return (List<Beacon>) query.getResultList();
    }
}
