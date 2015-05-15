package model.DAO;

import org.springframework.stereotype.Repository;
import model.User;

/**
 * Created by i843719 on 11/8/14.
 */
@Repository
public interface UserDAO {

    public void save(User user);

    public User getUser(String username);

}
