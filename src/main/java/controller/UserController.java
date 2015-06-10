package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by i843719 on 11/6/14.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    public UserController(final UserService userService) {
//        this.userService = userService;
//    }

//    /**
//     * Open a hibernate session and get the user object according to the user name.
//     *
//     * @param email username for client input
//     * @return User
//
//     */
//    @RequestMapping(method = RequestMethod.GET, value = {"/user/{email}"})
//    public
//    @ResponseBody
//    User getUser(@RequestParam(value = "email", required = true) @PathVariable("email") String email) {
//        return userDAOImp.getUser(email);
//    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody final User user) {
        return userService.save(user);
    }
}
