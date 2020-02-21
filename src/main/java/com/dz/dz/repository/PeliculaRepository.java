package com.dz.dz.repository;

import com.dz.dz.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

    @Query("Select pelicula.pelicula_id, pelicula.descripcion, cat.descripcion  from Pelicula pelicula join pelicula.categoria cat")
    Collection<Object> find_peliculas();

}
