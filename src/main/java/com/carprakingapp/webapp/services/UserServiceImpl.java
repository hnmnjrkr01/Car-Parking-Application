package com.carprakingapp.webapp.services;

import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDAO userDAO;


    @Override
    public User updateUser(Integer userId,User user) {
            User newUser = userDAO.findById(userId);


            newUser.setFirstname(user.getFirstname());
            newUser.setLastname(user.getLastname());
            newUser.setEmail(user.getEmail());
            newUser.setPhone(user.getPhone());
            return userDAO.save(newUser);

    }
}
