package com.example.proyectointermodularprogramacionbasededatos.controlador;

import com.example.proyectointermodularprogramacionbasededatos.servicio.AlumnoServices;
import com.example.proyectointermodularprogramacionbasededatos.servicio.PeliculasService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping ("/pelicula")
public class PeliculasControler {
    private final PeliculasService peliculasService;

}
