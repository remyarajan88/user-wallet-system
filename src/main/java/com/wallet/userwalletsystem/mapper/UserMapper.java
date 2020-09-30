package com.wallet.userwalletsystem.mapper;

import com.wallet.userwalletsystem.model.User;
import com.wallet.userwalletsystem.model.dao.UserDao;

public class UserMapper {

    public static UserDao mapToUserDao(User user){
        UserDao userDao = new UserDao();
        userDao.setEmailId(user.getEmailId());
        userDao.setFirstName(user.getFirstName());
        userDao.setLastName(user.getLastName());
        userDao.setPassword(user.getPassword());
        userDao.setPin(user.getPin());
        userDao.setPhoneNumber(user.getPhoneNumber());
        return userDao;

    }

    public static User mapToUser(UserDao userDao){
        User user = new User();
        user.setEmailId(userDao.getEmailId());
        user.setFirstName(userDao.getFirstName());
        user.setLastName(userDao.getLastName());
        user.setPhoneNumber(userDao.getPhoneNumber());
        return user;
    }
}
