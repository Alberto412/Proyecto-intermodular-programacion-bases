package com.example.proyectointermodularprogramacionbasededatos.servicio;

import com.example.proyectointermodularprogramacionbasededatos.repositorio.PeliculaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Service
public class PeliculasService {
    private final PeliculaRepositorio repositorio;
}
