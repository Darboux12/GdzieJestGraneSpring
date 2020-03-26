package com.gjg.services;

import com.gjg.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(User user);

    User findUserById(int id);

    void deleteUserById(int id);

    User findUserByEmail(String email);

    User finUserByUsername(String username);



}
