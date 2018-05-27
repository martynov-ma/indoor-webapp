package example.org.indoor.dao.impl;

import example.org.indoor.dao.CabinetDAO;
import example.org.indoor.entity.Cabinet;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class CabinetDAOImpl extends GenericDAOImpl<Cabinet, Integer> implements CabinetDAO {

    @Override
    public Cabinet findByName(String name) {
        Query query = entityManager.createQuery("from Cabinet where name = :name");
        query.setParameter("name", name);
        return (Cabinet) query.getResultList().get(0);
    }
}
