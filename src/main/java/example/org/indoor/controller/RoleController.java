package example.org.indoor.controller;

import example.org.indoor.controller.response.ErrorResponse;
import example.org.indoor.controller.response.Response;
import example.org.indoor.controller.response.SuccessResponse;
import example.org.indoor.entity.Role;
import example.org.indoor.service.RoleService;
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
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    /*
     * GET /api/roles - список ролей
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> list() {
        try {
            List<Role> roles = roleService.readAll();
            return new ResponseEntity<Response>(new SuccessResponse(roles), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * GET /api/roles/{id} - информация о роли
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> read(@PathVariable(value = "id") Integer id) {
        try {
            Role role = roleService.find(id);
            return new ResponseEntity<Response>(new SuccessResponse(role), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * POST /api/roles - добавление новой роли
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody Role role) {
        try {
            Integer newRoleId = roleService.create(role);
            return new ResponseEntity<Response>(new SuccessResponse(newRoleId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * PUT /api/roles - изменение информации о роли
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody Role role) {
        try {
            roleService.update(role);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * DELETE /api/roles/{id} - удаление роли
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Integer id) {
        try {
            roleService.delete(id);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
