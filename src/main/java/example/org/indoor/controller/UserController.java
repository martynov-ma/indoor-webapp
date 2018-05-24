package example.org.indoor.controller;

import example.org.indoor.controller.response.ErrorResponse;
import example.org.indoor.controller.response.Response;
import example.org.indoor.controller.response.SuccessResponse;
import example.org.indoor.entity.User;
import example.org.indoor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /*
     * GET /api/users - список пользователей
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> list() {
        try {
            List<User> users = userService.readAll();
            return new ResponseEntity<Response>(new SuccessResponse(users), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    /*
     * GET /api/users/{id} - информация о пользователе
     */
    @PreAuthorize("hasAnyAuthority('USER', 'MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> read(@PathVariable(value = "id") Integer id) {
        try {
            User user = userService.find(id);
            return new ResponseEntity<Response>(new SuccessResponse(user), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * POST /api/users - добавление нового пользователя
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody User user) {
        try {
            Integer newUserId = userService.create(user);
            return new ResponseEntity<Response>(new SuccessResponse(newUserId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * PUT /api/users - изменение информации о пользвателе
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody User user) {
        try {
            userService.update(user);
            return new ResponseEntity<>(new Response(true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * DELETE /api/users - удаление всех пользователей со стаутсом DELETED
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete() {
        try {
            Integer count = userService.deleteAll();
            return new ResponseEntity<Response>(new SuccessResponse(count), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * DELETE /api/users/{id} - удаление пользователя
     */
    @PreAuthorize("hasAnyAuthority('MANAGER', 'ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable(value = "id") Integer id) {
        try {
            Boolean result = userService.delete(id);
            return new ResponseEntity<Response>(new SuccessResponse(result), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Response>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
