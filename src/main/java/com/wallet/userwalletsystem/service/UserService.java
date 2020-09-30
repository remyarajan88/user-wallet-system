package com.wallet.userwalletsystem.service;

import com.wallet.userwalletsystem.mapper.UserMapper;
import com.wallet.userwalletsystem.model.User;
import com.wallet.userwalletsystem.model.dao.UserDao;
import com.wallet.userwalletsystem.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signupUser(User user){
        UserDao userDao= UserMapper.mapToUserDao(user);
        userDao = userRepository.save(userDao);
        return UserMapper.mapToUser(userDao);

    }

    public User loginUser(String emailId, String password){
        Optional<UserDao> userDao = userRepository.findById(emailId);
        if(userDao.isPresent()){
            if(password.equals(userDao.get().getPassword())){
                return UserMapper.mapToUser(userDao.get());
            }

        }
        return null;
    }
}
