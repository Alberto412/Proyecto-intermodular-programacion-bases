package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.ActoresRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class ActorServicio {
    private final ActoresRepositorio repositorio;
    public ArrayList<Actor> mostrar_actores(){
        return repositorio.mostrar_Actores();
    }
    public Actor addActor(Actor p){
        return repositorio.addActor(p);
    }
}
