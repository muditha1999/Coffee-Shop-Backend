package com.example.demo.controller;

import com.example.demo.DTO.UserRegDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/customer")

public class CustomerController {
    @Autowired
    private UserService userService;

    @PutMapping(path="/regUser")
    public String regUser(@RequestBody UserRegDTO userRegDTO){
        String msg= userService.userReg(UserRegDTO);
        return "";
    }
}
