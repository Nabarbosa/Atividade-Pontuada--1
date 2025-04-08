package com.senai.Atividade_Pontuada_API_REST_Spring_Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping
    public String welcome() {
        return "Bem Vindos!";
    }
}
