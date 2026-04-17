package com.example.proyectointermodularprogramacionbasededatos.repositorio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Director;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DirectorRepositorio {
    ArrayList<Director> actores= new ArrayList<>();
    public DirectorRepositorio(){
        actores.add(new Director(1L,"Pe causa hernandez",120));
        actores.add(new Director(2L,"Huge Jackman",89));
        actores.add(new Director(3L,"Jonh Lemon",69));
    }
    public ArrayList<Director>  mostrar_Actores(){
        return actores;
    }
    public Director addActor(Director p){
        actores.add(p);
        return p;
    }
}
