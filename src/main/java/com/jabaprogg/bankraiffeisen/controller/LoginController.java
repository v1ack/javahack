package com.jabaprogg.bankraiffeisen.controller;


import com.jabaprogg.bankraiffeisen.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login() {

        User testUser = new User();
        testUser.setEnabled(true);
        testUser.setId(0);
        testUser.setFirstName("FirstName");
        testUser.setLastName("LastName");
        testUser.setMiddleName("middleName");
        testUser.setEncryptedPassword("");

        return testUser;
    }


}
