package com.example.kevin_000.appacademia;

/**
 * Created by kevin_000 on 20/08/2017.
 */

public class Estudiante implements Academia {

    private String nombre;
    private String id;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Estudiante() {

        this.nombre = "nombre";
        this.id = "T00000000";

    }

    public Estudiante(String nombre, String id) {

        this.nombre = nombre;
        this.id = id;
    }


    @Override
    public String categoria() {
        return "Estudiante";
    }


    public void imprimir() {

        System.out.println(getNombre() + " + " + getId());


    }
}