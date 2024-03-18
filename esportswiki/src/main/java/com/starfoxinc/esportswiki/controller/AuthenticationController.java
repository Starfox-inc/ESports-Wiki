package com.starfoxinc.esportswiki.controller;

import com.starfoxinc.esportswiki.dto.UserRegistrationDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
    

    @PostMapping("/register")
    public String registerUser(@RequestBody UserRegistrationDto registrationDto) {
        
        return "User registration successful";
    }
}