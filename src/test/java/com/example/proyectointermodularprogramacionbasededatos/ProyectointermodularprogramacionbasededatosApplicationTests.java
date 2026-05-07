package com.example.proyectointermodularprogramacionbasededatos;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.ActoresRepositorio;
import com.example.proyectointermodularprogramacionbasededatos.repositorio.PeliculaRepositorio;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProyectointermodularprogramacionbasededatosApplicationTests {
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;
    @Autowired
    private ActoresRepositorio  ActoresRepositorio;
    @Test
    public void pruebaDeGuardadoYAtributos() {
        Pelicula pelicula = new Pelicula(
                null,
                "Interestellar",
                "Ciencia Ficcion",
                2025,
                null
        );
        // Guardar en la base de datos
        Pelicula peliGuardada = peliculaRepositorio.save(pelicula);
        // Verificaciones
        assertNotNull(peliGuardada.getId());

        assertEquals("Interestellar", peliGuardada.getTitulo());
        assertEquals("Ciencia Ficcion", peliGuardada.getGenero());
        assertEquals(2025, peliGuardada.getAnho());

        Actor actor = new Actor(
                null,
                "hbvfvevb",
                "jkvghgeuh"
        );
        // Guardar en la base de datos
        Actor actorguardao = ActoresRepositorio.save(actor);
        // Verificaciones
        assertNotNull(actor.getId());

        assertEquals("hbvfvevb", actorguardao.getNombre());
        assertEquals("jkvghgeuh", actorguardao.getNacionalidad());

    }

}
