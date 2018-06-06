package example.org.indoor.controller.ui;

import example.org.indoor.service.BeaconService;
import example.org.indoor.service.CabinetService;
import example.org.indoor.service.UserLocationService;
import example.org.indoor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntityViewController {

    private final UserService userService;
    private final BeaconService beaconService;
    private final CabinetService cabinetService;
    private final UserLocationService userLocationService;

    @Autowired
    public EntityViewController(UserService userService, BeaconService beaconService, CabinetService cabinetService, UserLocationService userLocationService) {
        this.userService = userService;
        this.beaconService = beaconService;
        this.cabinetService = cabinetService;
        this.userLocationService = userLocationService;
    }

    @RequestMapping(value = "/view/users.html", method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute("users", userService.readAll());
        return "users";
    }

    @RequestMapping(value = "/view/beacons.html", method = RequestMethod.GET)
    public String beacons(Model model) {
        model.addAttribute("beacons", beaconService.readAll());
        return "beacons";
    }

    @RequestMapping(value = "/view/cabinets.html", method = RequestMethod.GET)
    public String cabinets(Model model) {
        model.addAttribute("cabinets", cabinetService.readAll());
        return "cabinets";
    }

    @RequestMapping(value = "/view/history.html", method = RequestMethod.GET)
    public String usersLocationHistory(Model model) {
        model.addAttribute("locationsHistory", userLocationService.readAll());
        return "history";
    }
}
