package com.dz.dz.controllers;

import com.dz.dz.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.PELICULA)
public class PeliculaController {

    @GetMapping("")
    public String goAgente(){

        return "pelicula";
    }
}
