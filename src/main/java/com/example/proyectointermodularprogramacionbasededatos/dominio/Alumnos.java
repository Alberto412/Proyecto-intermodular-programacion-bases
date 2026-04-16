package com.example.proyectointermodularprogramacionbasededatos.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Alumnos {

    //atributos
    String nombre;
    String apellido;
    int edad;

    @Override
    public String toString() {
        return "Alumnos{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
