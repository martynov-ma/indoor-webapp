package example.org.indoor.service;

import example.org.indoor.entity.Role;

import java.util.List;

public interface RoleService {
    Integer create(Role role);
    Role find(Integer id);
    void update(Role role);
    void delete(Integer id);
    List<Role> readAll();
}
