package com.brevio.securingweb.controller.login.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LoginResponse {

    private boolean authenticated;
}
