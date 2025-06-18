package com.korit.authstudy.dto;

import com.korit.authstudy.domain.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@RequiredArgsConstructor
public class LoginDto {

    private final BCryptPasswordEncoder passwordEncoder;

    private String username;
    private String password;
    private String fullName;
    private String email;

}

