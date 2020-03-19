package com.gjg.controllers;

import com.gjg.models.Role;
import com.gjg.models.User;
import com.gjg.models.UserInformation;

import com.gjg.respositories.RoleRepository;
import com.gjg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BasicController {

    private final UserService userService;
    private RoleRepository roleRepository;

    @Autowired
    public BasicController(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
        this.roleRepository = roleRepository;
    }


    @GetMapping("/print")
    public String show(Model model){

        User user = new User("Ho","ha",new UserInformation("b",6,java.sql.Timestamp.valueOf("2017-11-15 15:30:14.332")));

        Role role = roleRepository.findRoleByName("admin");

        user.getRoles().add(role);

        role.getUsers().add(user);

        userService.addUser(user);











        /*
        Set<Role> roles = new HashSet<>();

        roles.add(new Role(1,"Admin"));
     //   roles.add(new Role(2,"Kot"));

       // User user = userService.findUserById(1);

      //  User user = userService.findUserById(1);

       User user = new User("Hej","ha",roles ,new UserInformation("a",6,java.sql.Timestamp.valueOf("2017-11-15 15:30:14.332")));


      userService.addUser(user);





     model.addAttribute("user",this.userService.findUserByEmail("Hej")); */


        return "show";
    }





}
