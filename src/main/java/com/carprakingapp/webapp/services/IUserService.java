package com.carprakingapp.webapp.services;

import com.carprakingapp.webapp.database.entity.User;

public interface IUserService {

    User updateUser(Integer userId,User user);
}
