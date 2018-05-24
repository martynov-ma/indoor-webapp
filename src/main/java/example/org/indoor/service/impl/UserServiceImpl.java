package example.org.indoor.service.impl;

import example.org.indoor.dao.UserDAO;
import example.org.indoor.entity.User;
import example.org.indoor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public Integer create(User user) {
        return userDAO.create(user);
    }

    @Transactional
    public User find(Integer id) {
        return userDAO.find(id);
    }

    @Transactional
    public void update(User user) {
        userDAO.update(user);
    }

    @Transactional
    public Boolean delete(Integer id) {
        return userDAO.execute("UPDATE users SET status = 'DELETED' WHERE id = " + id) == 1;
    }

    @Transactional
    public Integer deleteAll() {
        return userDAO.execute("DELETE FROM users WHERE status = 'DELETED'");
    }

    @Transactional
    public List<User> readAll() {
        return userDAO.readAll();
    }
}