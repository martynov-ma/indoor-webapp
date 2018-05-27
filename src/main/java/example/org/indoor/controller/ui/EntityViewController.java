package example.org.indoor.controller.ui;

import example.org.indoor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntityViewController {

    private final UserService userService;

    @Autowired
    public EntityViewController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/view/users.html", method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute("users", userService.readAll());
        return "users";
    }
}
