package com.amar.sports.cricket.fantasy.service;

import com.amar.sports.cricket.fantasy.dao.UserDao;
import com.amar.sports.cricket.fantasy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;


    public void registerUser(User user) {
        userDao.saveUser(user);
    }

}
