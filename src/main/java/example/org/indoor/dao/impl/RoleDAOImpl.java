package example.org.indoor.dao.impl;

import example.org.indoor.dao.RoleDAO;
import example.org.indoor.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl extends GenericDAOImpl<Role, Integer> implements RoleDAO {
    
}
