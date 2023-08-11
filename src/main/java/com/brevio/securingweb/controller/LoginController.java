package com.brevio.securingweb.controller;

import com.brevio.securingweb.controller.dto.LoginRequest;
import com.brevio.securingweb.controller.dto.LoginResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/auth")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse build = LoginResponse.builder().authenticated(true).build();
        return new ResponseEntity<>(build, HttpStatusCode.valueOf(200));
    }
    @GetMapping("/")
    public ResponseEntity<LoginResponse> get(){
        LoginResponse build = LoginResponse.builder().authenticated(true).build();
        return new ResponseEntity<>(build, HttpStatusCode.valueOf(200));
    }
}
