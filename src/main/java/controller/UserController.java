package controller;

import model.UserDAOImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import model.User;



/**
 * Created by i843719 on 11/6/14.
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserDAOImp userDAOImp;



    /**
     * Open a hibernate session and get the user object according to the user name.
     *
     * @param username username for client input
     * @return User

     */
    @RequestMapping(method = RequestMethod.GET, value = {"/user/{username}"})
    public
    @ResponseBody
    User getUser(@RequestParam(value = "username", required = true) @PathVariable("username") String username) {
        return new User();
    }
}
