package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import root.model.User;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


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
     * @throws HeuristicRollbackException
     * @throws RollbackException
     * @throws HeuristicMixedException
     * @throws SystemException
     */
    @RequestMapping(method = RequestMethod.GET, value = {"/authenticate/{username}"})
    public
    @ResponseBody
    User getUser(@RequestParam(value = "username", required = true) @PathVariable("username") String username, String password) throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException {
        return userDAOImp.getUser(username);
    }
}
