package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by xiaopingli on 6/9/15.
 */

@Component("userService")
@Transactional
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User save(User user) {
        return null;
    }
}
