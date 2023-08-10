package com.brevio.securingweb.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
public class LoginResponse {

    private boolean authenticated;
}
