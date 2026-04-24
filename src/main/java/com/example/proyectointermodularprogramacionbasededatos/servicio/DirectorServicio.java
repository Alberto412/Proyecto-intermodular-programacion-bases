package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Director;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class DirectorServicio {
    private final DirectorRepositoriod repositorio;
    public ArrayList<Director> mostrar_actores(){
        return repositorio.mostrar_Actores();
    }
    public Director addActor(Director p){
        return repositorio.addActor(p);
    }
}
