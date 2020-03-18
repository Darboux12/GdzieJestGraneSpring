package com.gjg.services;

import com.gjg.models.User;

public interface UserService {

    void addUser(User user);

    User findUserById(int id);

    void deleteUserById(int id);



}
