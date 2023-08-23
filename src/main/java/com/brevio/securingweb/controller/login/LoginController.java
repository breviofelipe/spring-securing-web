package com.brevio.securingweb.controller.login;

import com.brevio.securingweb.controller.login.dto.LoginRequest;
import com.brevio.securingweb.model.JwtAuthenticationResponse;
import com.brevio.securingweb.model.SignUpRequest;
import com.brevio.securingweb.model.SigninRequest;
import com.brevio.securingweb.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {



    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/auth")
    public ResponseEntity<JwtAuthenticationResponse> login(@RequestBody LoginRequest request){
        var response = authenticationService.signin(SigninRequest.builder().email(request.getUser()).password(request.getPassword()).build());
        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signUp")
    public ResponseEntity<JwtAuthenticationResponse> signUp(@RequestBody SignUpRequest request){
        var response = authenticationService.signup(request);
        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }
    private final AuthenticationService authenticationService;
}
