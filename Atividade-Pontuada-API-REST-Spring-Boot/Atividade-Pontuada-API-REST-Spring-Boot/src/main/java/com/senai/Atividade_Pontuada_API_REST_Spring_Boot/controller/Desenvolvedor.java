package com.senai.Atividade_Pontuada_API_REST_Spring_Boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class Desenvolvedor {

    @GetMapping
    public String dev() {
        return ("Nome do Desenvolvedor : Tainá Barbosa Teixeira");
    }
}
