package com.dz.dz.restcontrollers;


import com.dz.dz.models.Pelicula;
import com.dz.dz.services.PeliculaServicio;
import com.dz.dz.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(UrlConstants.PELICULA)
public class PeliculasRestControllers {

    @Autowired
    PeliculaServicio service;

    @GetMapping(UrlConstants.LIST)
    public Collection<Object> list(){
        return service.find_peliculas();
    }
}
