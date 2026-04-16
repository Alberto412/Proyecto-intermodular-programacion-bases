package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Alumno;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AllArgsConstructor
@Service //lo convierte en un servicio
public class AlumnoServices {

    //metodo
    @GetMapping
    public Alumno getAlumno(){
        return new Alumno("Alberto","Navarro",18,1);
    }

    @GetMapping("/saludo/{name}")
    public String saludar(@PathVariable("name") String alumno) {
        return "Hola " + alumno;
    }



}
