package com.dz.dz.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @Column(name="pelicula_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer pelicula_id;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToOne(optional = false)
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id", insertable = false, updatable = false)
    private  Categoria categoria;

    public Pelicula() {
    }

    public Integer getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(Integer pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
