package br.com.elibrito.demo_moderjwt.demo_modern_jwt.controller;

import br.com.elibrito.demo_moderjwt.demo_modern_jwt.service.AuthenticationService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping
    public String authenticate(Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }

}
