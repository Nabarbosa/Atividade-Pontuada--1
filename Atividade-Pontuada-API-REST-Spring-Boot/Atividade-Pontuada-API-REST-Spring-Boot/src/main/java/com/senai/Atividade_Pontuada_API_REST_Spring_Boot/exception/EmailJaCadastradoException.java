package com.senai.Atividade_Pontuada_API_REST_Spring_Boot.exception;

public class EmailJaCadastradoException extends RuntimeException{
    public  EmailJaCadastradoException(String message){
        super(message);
    }
}
