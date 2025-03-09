package com.e_mart.user.service;

import com.e_mart.user.util.JwtTokenUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final JwtTokenUtil jwtTokenUtil;

    public UserService(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    public String generateToken(String username) {
        return jwtTokenUtil.generateToken(username);
    }

}
