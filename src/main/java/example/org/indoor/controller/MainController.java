package example.org.indoor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index.html")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
