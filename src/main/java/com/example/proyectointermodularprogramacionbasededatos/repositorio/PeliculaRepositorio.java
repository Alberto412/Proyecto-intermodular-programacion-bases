package com.example.proyectointermodularprogramacionbasededatos.repositorio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
@Repository
public class PeliculaRepositorio {
    private ArrayList<Pelicula> peliculas= new ArrayList<>();
    public PeliculaRepositorio(){
        peliculas.add(new Pelicula(1L,"el increible pedro parques embargaron la casa","peru",2022));
        peliculas.add(new Pelicula(2L,"el increible pedro parques sin casa","accion",2024));
        peliculas.add(new Pelicula(3L,"el increible pedro parques recuperamos la casa","peru",2025));
    }
    public ArrayList<Pelicula>  mostrar_peliculas(){
        return peliculas;
    }
    public Pelicula addPelicula(Pelicula p){
        peliculas.add(p);
        return p;
    }
}
