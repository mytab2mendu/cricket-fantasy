package com.amar.sports.cricket.fantasy.dao;

import com.amar.sports.cricket.fantasy.domain.Role;
import com.amar.sports.cricket.fantasy.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends AbstractDao {

    public void saveUser(User user) {
        save(user);
    }

    public void saveRole(Role role) {
        save(role);
    }

}
