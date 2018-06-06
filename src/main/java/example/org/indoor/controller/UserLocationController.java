package example.org.indoor.controller;

import example.org.indoor.controller.response.ErrorResponse;
import example.org.indoor.controller.response.Response;
import example.org.indoor.controller.response.SuccessResponse;
import example.org.indoor.entity.dto.UserLocationDto;
import example.org.indoor.service.UserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/location")
public class UserLocationController {

    private final UserLocationService userLocationService;

    @Autowired
    public UserLocationController(UserLocationService userLocationService) {
        this.userLocationService = userLocationService;
    }

    /*
     * GET /api/location?beacons={beaconName}&beacons={beaconName}&... - получить координаты по меткам
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> list(@RequestParam List<String> beacons) {
        try {
            UserLocationDto userLocation = userLocationService.findLocation(beacons);
            return new ResponseEntity<Response>(new SuccessResponse(userLocation), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
