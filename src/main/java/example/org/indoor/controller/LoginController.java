package example.org.indoor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login.html")
public class LoginController  {

    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
