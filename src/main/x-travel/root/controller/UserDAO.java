package root.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

/**
 * Created by i843719 on 11/7/14.
 */

public class UserDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public UserDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    /**
     * According to the username, output a User object.
     * @param username
     * @return
     */
    
    public User getUser(String username) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        User user1 = null;
        try {
            tx = (Transaction) session.beginTransaction();
            Criteria criteria = session.createCriteria(User.class);
            // find user object by using criteria other than query
            user1 = (User) criteria.add(Restrictions.eq("username", username))
                    .uniqueResult();
            tx.commit();
        } catch (Throwable e) {
            if (tx != null)
                try {
                    tx.rollback();
                } catch (SystemException e1) {
                    e1.printStackTrace();
                }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user1;
    }
}
