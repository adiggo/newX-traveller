package model.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 5/14/15.
 */
public class AbstractDAO {


        @Autowired
        private SessionFactory sessionFactory;

        protected Session getSession() {
            return sessionFactory.getCurrentSession();
        }

        public void persist(Object entity) {
            getSession().persist(entity);
        }

        public void delete(Object entity) {
            getSession().delete(entity);
        }

}
