package example.org.indoor.dao.impl;

import example.org.indoor.dao.UserLocationDAO;
import example.org.indoor.entity.UserLocation;
import org.springframework.stereotype.Repository;

@Repository
public class UserLocationDAOImpl extends GenericDAOImpl<UserLocation, Integer> implements UserLocationDAO {
}
