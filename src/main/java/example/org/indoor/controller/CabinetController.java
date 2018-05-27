package example.org.indoor.controller;

import example.org.indoor.controller.response.ErrorResponse;
import example.org.indoor.controller.response.Response;
import example.org.indoor.controller.response.SuccessResponse;
import example.org.indoor.entity.Cabinet;
import example.org.indoor.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api/cabinets")
public class CabinetController {

    @Autowired
    private CabinetService cabinetService;

    /*
     * GET /api/cabinets - список кабинетов
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> list() {
        try {
            List<Cabinet> cabinets = cabinetService.readAll();
            return new ResponseEntity<Response>(new SuccessResponse(cabinets), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * GET /api/cabinets/{id} - информация о кабинете
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> read(@PathVariable(value = "id") Integer id) {
        try {
            Cabinet cabinet = cabinetService.find(id);
            return new ResponseEntity<Response>(new SuccessResponse(cabinet), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * POST /api/cabinets - добавление нового кабинета
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody Cabinet cabinet) {
        try {
            Integer newCabinetId = cabinetService.create(cabinet);
            return new ResponseEntity<Response>(new SuccessResponse(newCabinetId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * PUT /api/cabinets - изменение информации о кабинете
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody Cabinet cabinet) {
        try {
            cabinetService.update(cabinet);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * DELETE /api/cabinets/{id} - удаление кабинета
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Integer id) {
        try {
            cabinetService.delete(id);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
