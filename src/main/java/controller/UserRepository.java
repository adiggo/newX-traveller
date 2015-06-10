package controller;


import org.springframework.data.repository.Repository;

/**
 * Created by xiaopingli on 6/9/15.
 */
public interface UserRepository extends Repository<User, Long> {
    User findUserByName(String id);
}
