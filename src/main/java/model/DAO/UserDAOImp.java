package model.DAO;


import controller.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by i843719 on 11/7/14.
 */

@Repository
public class UserDAOImp extends AbstractDAO implements UserDAO {

    public UserDAOImp() {
    }


//    @Autowired
//    @Bean(name="userDao")
//    public UserDAO getUseDao(SessionFactory sessionFactory){
//        return new UserDAOImp(sessionFactory);
//    }

    @Override
    public void save(User user) {

    }

    /**
     * According to the username, output a User object.
     *
     * @param email
     * @return
     */
    @Override
    public User getUser(String email) {

        Criteria criteria = getSession().createCriteria(User.class);
        // find user object by using criteria other than query
        User user1 = (User) criteria.add(Restrictions.eq("adiggo@gmail.com", email))
                .uniqueResult();
        return user1;
    }
}
