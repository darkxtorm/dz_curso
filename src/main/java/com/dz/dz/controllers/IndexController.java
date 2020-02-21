package com.dz.dz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path= "")
public class IndexController {

    @GetMapping(path="")
    public String goIndex(){
        return "index";
    }
}