package com.gjg.services;

import com.gjg.models.Role;
import com.gjg.models.User;
import com.gjg.respositories.RoleRepository;
import com.gjg.respositories.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, @Lazy BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User findUserById(int id) {
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUserById(int id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public void addUser(User user) {

        Role role = roleRepository.findRoleByName("admin");

        user.getRoles().add(role);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        user.getUserInformation().setCreation_date(new Timestamp(new Date().getTime()));
        this.userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }

    @Override
    public User finUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username);
    }
}
