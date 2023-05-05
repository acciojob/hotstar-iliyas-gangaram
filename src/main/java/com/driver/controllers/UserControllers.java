package com.driver.controllers;


import com.driver.model.User;
import com.driver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserControllers {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public int addUser(User user){
        //Add a user to the database and return the autoGenerated Id by the user
        return userService.addUser(user);
    }

    @GetMapping("/getAvaialbleWebSeries")
    public Integer getAvailableCountOfWebSeriesViewable(@RequestParam("userId")Integer userId){

        return userService.getAvailableCountOfWebSeriesViewable(userId);
    }

}