package example.org.indoor.dao;

import example.org.indoor.entity.User;

public interface UserDAO extends GenericDAO<User, Integer> {

    User findByLogin(String login);
}
