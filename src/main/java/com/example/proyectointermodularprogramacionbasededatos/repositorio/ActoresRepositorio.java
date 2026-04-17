package com.example.proyectointermodularprogramacionbasededatos.repositorio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ActoresRepositorio {
    ArrayList<Actor> actores= new ArrayList<>();
    public ActoresRepositorio(){
        actores.add(new Actor(1L,"Pe causa hernandez","peru"));
        actores.add(new Actor(2L,"Huge Jackman","Canadada"));
        actores.add(new Actor(3L,"Jonh Lemon","AMERICA"));
    }
    public ArrayList<Actor>  mostrar_Actores(){
        return actores;
    }
    public Actor addActor(Actor p){
        actores.add(p);
        return p;
    }
}
