package com.gjg.controllers;

import com.gjg.models.User;
import com.gjg.respositories.UserRepository;

import com.gjg.services.UserService;
import com.gjg.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Controller
public class BasicController {

    @Autowired(required = true)
    private UserServiceImpl userService;

    @GetMapping("/print")
    public String show(Model model){

     //   User user = new User("Jek","ha");

       // userRepository.save(user);

        User user = userService.findUserById(1);


        model.addAttribute("user",user);


        return "show";
    }





}
