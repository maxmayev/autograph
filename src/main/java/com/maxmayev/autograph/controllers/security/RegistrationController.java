package com.maxmayev.autograph.controllers.security;

import com.maxmayev.autograph.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/register")
@SessionAttributes("user")
public class RegistrationController {

    UserRepository userRepository;
    PasswordEncoder encoder;

    public RegistrationController(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @GetMapping

    public String registerForm(){
        return "registration";
    }


    @PostMapping

    public String processRegistration(RegistrationForm form){
        userRepository.save(form.toUser(encoder));
        return "redirect:/login";
    }

}
