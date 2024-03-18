package com.starfoxinc.esportswiki.service;

import com.starfoxinc.esportswiki.dto.UserRegistrationDto;
import com.starfoxinc.esportswiki.model.User;
import com.starfoxinc.esportswiki.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(UserRegistrationDto registrationDto) {
        User user = new User();
        user.setEmail(registrationDto.getEmail());
        user.setPasswordHash(passwordEncoder.encode(registrationDto.getPassword()));
        //Save user tot he database
        return userRepository.save(user);
    }
