package com.example.spring;

public class InfoNotFoundException extends RuntimeException{

    InfoNotFoundException(Long id){
        super("could not find info" + id);
    }


}