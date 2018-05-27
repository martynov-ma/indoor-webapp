package example.org.indoor.dao.impl;

import example.org.indoor.dao.CabinetDAO;
import example.org.indoor.entity.Cabinet;
import org.springframework.stereotype.Repository;

@Repository
public class CabinetDAOImpl extends GenericDAOImpl<Cabinet, Integer> implements CabinetDAO {

}
