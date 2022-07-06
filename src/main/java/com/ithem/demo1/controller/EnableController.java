package com.ithem.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnableController {
    @RequestMapping("/login")
    public String All(){
        return "login.html";
    }
}
