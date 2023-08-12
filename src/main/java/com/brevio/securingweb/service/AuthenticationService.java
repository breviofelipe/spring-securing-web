package com.brevio.securingweb.service;

import com.brevio.securingweb.model.JwtAuthenticationResponse;
import com.brevio.securingweb.model.SignUpRequest;
import com.brevio.securingweb.model.SigninRequest;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
