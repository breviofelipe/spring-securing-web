package com.brevio.securingweb.controller.login.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LoginRequest {

    private String user;
    private String password;
}
