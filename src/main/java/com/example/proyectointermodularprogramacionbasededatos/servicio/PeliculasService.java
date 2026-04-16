package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.PeliculaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class PeliculasService {
    private final PeliculaRepositorio repositorio;
    public ArrayList<Pelicula> mostrar_peliculas(){
        return repositorio.mostrar_peliculas();
    }
    public Pelicula addPelicula(Pelicula p){
        return repositorio.addPelicula(p);
    }
}
