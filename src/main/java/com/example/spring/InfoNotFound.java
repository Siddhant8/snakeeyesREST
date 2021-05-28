package com.example.spring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InfoNotFound {

    @ResponseBody
    @ExceptionHandler(InfoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String infoNotFoundHandler(InfoNotFoundException exception){
        return exception.getMessage();
    }
}

