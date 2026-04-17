package com.example.proyectointermodularprogramacionbasededatos.controlador;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.servicio.AlumnoServices;
import com.example.proyectointermodularprogramacionbasededatos.servicio.PeliculasService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@AllArgsConstructor
@RestController
@RequestMapping ("/pelicula")
public class PeliculasControler {
    private final PeliculasService peliculasService;
    @GetMapping
    public ArrayList<Pelicula> mostrar_peliculas(){return peliculasService.mostrar_peliculas();}
    @PostMapping
    public Pelicula addPelicula(Pelicula p){return peliculasService.addPelicula(p);}


}
