package example.org.indoor.dao;

import example.org.indoor.entity.User;
import example.org.indoor.entity.UserStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-test-context.xml")
public class UserDAOImplTest {

    private User user;

    @Autowired
    private UserDAO userDAO;

    @Before
    public void init() {
        user = new User();
        user.setLogin("login");
        user.setPassword("password");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setStatus(UserStatus.ACTIVE);

        userDAO.create(user);
    }

    @Test
    @Transactional
    @Rollback
    public void testCreateUser() {
        User user = new User();
        user.setLogin("test");
        user.setPassword("test");

        userDAO.create(user);
        assertNotNull("user created", user.getId());
    }

    @Test
    @Transactional
    @Rollback
    public void testFindUser() {
        User user = userDAO.find(this.user.getId());
        assertNotNull(user);
        assertEquals("user found", "login", user.getLogin());
    }

    @Test
    @Transactional
    @Rollback
    public void testUpdateUser() {
        User user = userDAO.find(this.user.getId());
        assertEquals("user old login", "login", user.getLogin());

        String newLogin = "newLogin";
        user.setLogin(newLogin);
        userDAO.update(user);

        user = userDAO.find(this.user.getId());
        assertEquals("user login updated", newLogin, user.getLogin());
    }

    @Test
    @Transactional
    @Rollback
    public void testDeleteUser() {
        userDAO.delete(this.user.getId());
        List<User> usersList = userDAO.readAll();
        assertEquals("user deleted", 0, usersList.size());
    }
}
