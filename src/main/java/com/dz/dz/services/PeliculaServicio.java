package com.dz.dz.services;

import com.dz.dz.models.Pelicula;
import com.dz.dz.repository.PeliculaRepository;
import org.springframework.stereotype.Service;
import com.dz.dz.repository.CRUD;

import java.util.Collection;
import java.util.List;

@Service
public class PeliculaServicio extends CRUD<Pelicula, PeliculaRepository> {

    public PeliculaServicio(PeliculaRepository repository) {
        super(repository);
    }

    @Override
    public List<Pelicula> list() {
        return repository.findAll();
    }

    @Override
    public Pelicula get(int id) {
        return null;
    }

    @Override
    public void add(Pelicula o) {

    }

    @Override
    public void update(Pelicula o, int id) {

    }

    @Override
    public void delete(int id) {

    }

    public Collection<Object> find_peliculas(){
        return repository.find_peliculas();
    }
}
