
package com.example.proyectointermodularprogramacionbasededatos.controlador;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Pelicula;
import com.example.proyectointermodularprogramacionbasededatos.servicio.ActorServicio;
import com.example.proyectointermodularprogramacionbasededatos.servicio.PeliculasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;

@AllArgsConstructor
@RestController
@RequestMapping("/actores")
public class ControladorActor {
    private final ActorServicio actorServicio;
    @GetMapping
    public ArrayList<Actor> mostrar_actor(){return actorServicio.mostrar_actores();}
    @PostMapping
    public Actor addActor(@RequestBody Actor p){return actorServicio.addActor(p);}


}