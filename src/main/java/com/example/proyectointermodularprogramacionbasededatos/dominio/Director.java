package com.example.proyectointermodularprogramacionbasededatos.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Director {
    private Long id;
    private String nombre;
    private int edad;
}
