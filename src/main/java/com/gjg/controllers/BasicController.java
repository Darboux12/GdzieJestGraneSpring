package com.gjg.controllers;

import com.gjg.models.Role;
import com.gjg.models.User;
import com.gjg.models.UserInformation;

import com.gjg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BasicController {

    private final UserService userService;

    @Autowired
    public BasicController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/print")
    public String show(Model model){





       // User user = userService.findUserById(1);

      //  User user = userService.findUserById(1);

        User user = new User("Hej","ha",new Role(1,"admin"),new UserInformation("a",6,java.sql.Timestamp.valueOf("2017-11-15 15:30:14.332")));


        userService.addUser(user);





     model.addAttribute("user",user);


        return "show";
    }





}
