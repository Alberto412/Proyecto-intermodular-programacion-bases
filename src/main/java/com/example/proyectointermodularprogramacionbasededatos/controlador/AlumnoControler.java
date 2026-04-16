package com.example.proyectointermodularprogramacionbasededatos.controlador;

import com.example.proyectointermodularprogramacionbasededatos.dominio.Alumnos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/alumno")
public class AlumnoControler {

    @GetMapping
    public Alumnos getAlumno(){
        return new Alumnos("Alberto","Navarro",18);
    }
}