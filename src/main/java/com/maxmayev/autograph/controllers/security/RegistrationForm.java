package com.maxmayev.autograph.controllers.security;


import com.maxmayev.autograph.domain.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private String username;
    private String password;

    public User toUser(PasswordEncoder encoder){
        return new User(username,encoder.encode(password));
    }
}
