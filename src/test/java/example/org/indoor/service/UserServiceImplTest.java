package example.org.indoor.service;

import example.org.indoor.dao.UserDAO;
import example.org.indoor.entity.User;
import example.org.indoor.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-test-context.xml")
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserDAO userDAO;

    @Before
    public void setupMock() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findUserTest() {
        when(userDAO.find(any(Integer.class))).thenReturn(new User());
        User user = userService.find(1);
        assertNotNull("user found", user);
    }

    @Test
    public void createUserTest() {
        userService.create(new User());
        verify(userDAO, times(1)).create(any(User.class));
    }

    @Test
    public void updateUserTest() {
        User user = new User();
        user.setId(1);
        userService.update(user);
        verify(userDAO, times(1)).update(any(User.class));
    }

    @Test
    public void deleteUserTest() {
        userService.delete(1);
        verify(userDAO, times(1)).execute(any(String.class));
    }

    @Test
    public void listUsersTest() {
        userService.readAll();
        verify(userDAO, times(1)).readAll();
    }
}
