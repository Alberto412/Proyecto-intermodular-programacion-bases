package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Director;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.ActoresRepositorio;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.DirectorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class DirectorServicio {
    private final DirectorRepositorio repositorio;
    public ArrayList<Director> mostrar_actores(){
        return repositorio.mostrar_Actores();
    }
    public Director addActor(Director p){
        return repositorio.addActor(p);
    }
}
