package com.example.MongoDBConnect.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Edinson Ayui
 */
@Document
public class Mascota {

    @Id
    private Integer id;
    private String nombre;
    private String especie;
    private String raza;

    public Mascota(Integer id, String nombre, String especie, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }

    public Mascota() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
