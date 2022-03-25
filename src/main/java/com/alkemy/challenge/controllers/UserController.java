/*package com.alkemy.challenge.controllers;

import com.alkemy.challenge.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
public User getUser(@PathVariable Long id){

      User user = new User();
      user.setId(id);
      user.setUser("Admin");
      user.setPassword("Admin");

      return user;

    }

    @RequestMapping(value = "user/search")
    public User search(){

        User user = new User();

        user.setUser("Admin");
        user.setPassword("Admin");

        return user;

    }

    @RequestMapping(value = "user/edit")
    public User edit(){

        User user = new User();

        user.setUser("Admin");
        user.setPassword("Admin");

        return user;

    }

    @RequestMapping(value = "user/delete")
    public User delete(){

        User user = new User();

        user.setUser("Admin");
        user.setPassword("Admin");

        return user;

    }
}*/

