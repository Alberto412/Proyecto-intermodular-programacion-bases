package com.example.proyectointermodularprogramacionbasededatos.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Alumno {

    //atributos
    String nombre;
    String apellido;
    int edad;
    int id;

    @Override
    public String toString() {
        return "Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
