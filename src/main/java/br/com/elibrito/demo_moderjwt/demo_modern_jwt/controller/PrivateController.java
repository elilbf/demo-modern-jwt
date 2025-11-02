package br.com.elibrito.demo_moderjwt.demo_modern_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String getMessage(){
        return "Dentro do PrivateController";
    }
}
