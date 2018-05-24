package example.org.indoor.controller;

import example.org.indoor.entity.User;
import example.org.indoor.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-test-context.xml")
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void listUsersTest() throws Exception {
        User firstUser = new User();
        User secondUser = new User();
        firstUser.setId(1);
        secondUser.setId(2);

        List<User> users = new ArrayList<User>();
        users.add(firstUser);
        users.add(secondUser);
        when(userService.readAll()).thenReturn(users);

        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)))
                .andExpect(jsonPath("$.result", hasSize(2)))
                .andExpect(jsonPath("$.result[0].id", is(1)))
                .andExpect(jsonPath("$.result[1].id", is(2)));

        verify(userService, times(1)).readAll();
        verifyNoMoreInteractions(userService);
    }

    @Test
    public void getUserByIdTest() throws Exception {
        User user = new User();
        user.setId(1);

        when(userService.find(1)).thenReturn(user);
        mockMvc.perform(get("/api/users/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)))
                .andExpect(jsonPath("$.result.id", is(1)));

        verify(userService, times(1)).find(any(Integer.class));
    }

    @Test
    public void createUserTest() throws Exception {
        User user = new User();
        String userJsonStr = new ObjectMapper().writeValueAsString(user);
        mockMvc.perform(
                post("/api/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJsonStr))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)))
                .andExpect(jsonPath("$.result", is(0)));

        verify(userService, times(1)).create(any(User.class));
    }

    @Test
    public void updateUserTest() throws Exception {
        User user = new User();
        user.setId(1);
        String userJsonStr = new ObjectMapper().writeValueAsString(user);
        mockMvc.perform(
                put("/api/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJsonStr))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)));

        verify(userService, times(1)).update(any(User.class));
    }

    @Test
    public void deleteAllUsersTest() throws Exception {
        when(userService.deleteAll()).thenReturn(2);
        mockMvc.perform(delete("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)))
                .andExpect(jsonPath("$.result", is(2)));

        verify(userService, times(1)).deleteAll();
        verifyNoMoreInteractions(userService);
    }

    @Test
    public void deleteUserTest() throws Exception {
        mockMvc.perform(delete("/api/users/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.success", is(true)));

        verify(userService, times(1)).delete(any(Integer.class));
        verifyNoMoreInteractions(userService);
    }
}
