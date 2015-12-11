package io.tonyc.websample.api;

import io.tonyc.web.common.bean.ResponseMessage;
import io.tonyc.websample.Constants;
import io.tonyc.websample.domain.User;
import io.tonyc.websample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tony on 2015/12/9.
 */
@RestController
@RequestMapping(Constants.URI_API + "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> list() {
        List<User> list = userService.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> get(@PathVariable Integer id) {
        User entity = userService.findById(id);
        return new ResponseEntity(entity, HttpStatus.OK);
    }

}
