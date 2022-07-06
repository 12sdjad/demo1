package com.ithem.demo1.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/*异常拦截器*/
@RestControllerAdvice
public class AdviseController {
    /*拦截所有异常信息*/
    @ExceptionHandler
    public String a(Exception e){
        e.printStackTrace();
        return e.toString();
    }
}
