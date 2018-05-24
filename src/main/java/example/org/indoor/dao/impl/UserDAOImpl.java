package example.org.indoor.dao.impl;

import example.org.indoor.dao.UserDAO;
import example.org.indoor.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User, Integer> implements UserDAO {

    @Override
    public User findByLogin(String login) {
        Query query = entityManager.createQuery("from User where login = :login");
        query.setParameter("login", login);
        return (User) query.getResultList().get(0);
    }
}
