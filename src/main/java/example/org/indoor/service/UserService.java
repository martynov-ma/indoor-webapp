package example.org.indoor.service;

import example.org.indoor.entity.User;

import java.util.List;

public interface UserService {
    Integer create(User user);
    User find(Integer id);
    void update(User user);
    Boolean delete(Integer id);
    Integer deleteAll();
    List<User> readAll();
}
