package example.org.indoor.service.impl;

import example.org.indoor.dao.RoleDAO;
import example.org.indoor.entity.Role;
import example.org.indoor.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    @Transactional
    public Integer create(Role role) {
        return roleDAO.create(role);
    }

    @Transactional
    public Role find(Integer id) {
        return roleDAO.find(id);
    }

    @Transactional
    public void update(Role role) {
        roleDAO.update(role);
    }

    @Transactional
    public void delete(Integer id) {
        roleDAO.delete(id);
    }

    @Transactional
    public List<Role> readAll() {
        return roleDAO.readAll();
    }
}
