
package com.example.proyectointermodularprogramacionbasededatos.controlador;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Actor;
import com.example.proyectointermodularprogramacionbasededatos.dominio.Director;
import com.example.proyectointermodularprogramacionbasededatos.servicio.ActorServicio;
import com.example.proyectointermodularprogramacionbasededatos.servicio.DirectorServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;

@AllArgsConstructor
@RestController
@RequestMapping("/director")
public class ControladorDirector {
    private final DirectorServicio actorServicio;
    @GetMapping
    public ArrayList<Director> mostrar_actor(){return actorServicio.mostrar_actores();}
    @PostMapping
    public Director addActor(@RequestBody Director p){return actorServicio.addActor(p);}
}