package com.example.proyectointermodularprogramacionbasededatos.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Actor {
    private Long id;
    private String nombre;
    private String Nacionalidad;
}
