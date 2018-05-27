package example.org.indoor.controller;

import example.org.indoor.controller.response.ErrorResponse;
import example.org.indoor.controller.response.Response;
import example.org.indoor.controller.response.SuccessResponse;
import example.org.indoor.entity.Beacon;
import example.org.indoor.service.BeaconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/beacons")
public class BeaconController {

    private final BeaconService beaconService;

    @Autowired
    public BeaconController(BeaconService beaconService) {
        this.beaconService = beaconService;
    }

    /*
     * GET /api/beacons - список меток
     * GET /api/beacons?floorNum={floorNum} - список меток на этаже
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> list(@RequestParam(value = "floorNum", required = false) Integer floorNum) {
        try {
            List<Beacon> beacons;
            if (floorNum == null) {
                beacons = beaconService.readAll();
            } else {
                beacons = beaconService.readAllByFloorNum(floorNum);
            }
            return new ResponseEntity<Response>(new SuccessResponse(beacons), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * GET /api/beacons/{id} - информация о метке
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> read(@PathVariable(value = "id") Integer id) {
        try {
            Beacon beacon = beaconService.find(id);
            return new ResponseEntity<Response>(new SuccessResponse(beacon), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * POST /api/beacons - добавление новой метки
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody Beacon beacon) {
        try {
            Integer newBeaconId = beaconService.create(beacon);
            return new ResponseEntity<Response>(new SuccessResponse(newBeaconId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * PUT /api/beacons - изменение информации о метке
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody Beacon beacon) {
        try {
            beaconService.update(beacon);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * DELETE /api/beacons/{id} - удаление метки
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Integer id) {
        try {
            beaconService.delete(id);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
