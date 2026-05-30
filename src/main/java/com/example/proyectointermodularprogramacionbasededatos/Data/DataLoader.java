package com.example.proyectointermodularprogramacionbasededatos.Data;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Director;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.ActoresRepositorio;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.DirectorRepositorio;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.PeliculaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final PeliculaRepositorio peliculaRepositorio;
    private final ActoresRepositorio actoresRepositorio;
    private final DirectorRepositorio directorRepositorio;

    @Override
    public void run(String... args) {
        if (peliculaRepositorio.count() == 0 && actoresRepositorio.count() == 0 && directorRepositorio.count() == 0) {
            Pelicula pelicula1 = new Pelicula();
            pelicula1.setTitulo("Pelicula 1");
            pelicula1.setGenero("Drama");
            pelicula1.setAnho(2001);
            pelicula1.setCategoriaVisual("");

            Pelicula pelicula2 = new Pelicula();
            pelicula2.setTitulo("Pelicula 2");
            pelicula2.setGenero("Accion");
            pelicula2.setAnho(2005);
            pelicula2.setCategoriaVisual("");

            peliculaRepositorio.saveAll(List.of(pelicula1, pelicula2));

            Director director1 = new Director();
            director1.setNombre("Director 1");
            director1.setEdad(50);

            Director director2 = new Director();
            director2.setNombre("Director 2");
            director2.setEdad(45);

            Director director3 = new Director();
            director3.setNombre("Director 3");
            director3.setEdad(40);

            directorRepositorio.saveAll(List.of(director1, director2, director3));

            pelicula1.setDirectores(List.of(director1));
            pelicula2.setDirectores(List.of(director2, director3));
            peliculaRepositorio.saveAll(List.of(pelicula1, pelicula2));

            Actor actor1 = new Actor();
            actor1.setNombre("Actor 1");
            actor1.setNacionalidad("Nacionalidad 1");
            actor1.setPelicula(pelicula1);

            Actor actor2 = new Actor();
            actor2.setNombre("Actor 2");
            actor2.setNacionalidad("Nacionalidad 2");
            actor2.setPelicula(pelicula1);

            Actor actor3 = new Actor();
            actor3.setNombre("Actor 3");
            actor3.setNacionalidad("Nacionalidad 3");
            actor3.setPelicula(pelicula2);

            Actor actor4 = new Actor();
            actor4.setNombre("Actor 4");
            actor4.setNacionalidad("Nacionalidad 4");
            actor4.setPelicula(pelicula2);

            actoresRepositorio.saveAll(List.of(actor1, actor2, actor3, actor4));
            System.out.println("✅ DataLoader CINE cargado: 2 peliculas, 4 actores, 3 directores.");
        }
    }
}
