package com.gjg.services;

import com.gjg.models.User;
import com.gjg.respositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(int id) {
        return this.userRepository.findById(id).orElse(null);
    }





}
