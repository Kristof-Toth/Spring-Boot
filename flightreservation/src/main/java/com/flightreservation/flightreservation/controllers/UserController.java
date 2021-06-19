package com.flightreservation.flightreservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flightreservation")
public class UserController {

    @RequestMapping("/showReg")
    public String showRegistrationPage(){
        return "login/registerUser";
    }
}
