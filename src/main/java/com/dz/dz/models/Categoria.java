package com.dz.dz.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id
    @Column(name="categoria_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer categoria_id;

    @Column(name = "descripcion")
    private String descripcion;

    public Categoria() {
    }


    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
