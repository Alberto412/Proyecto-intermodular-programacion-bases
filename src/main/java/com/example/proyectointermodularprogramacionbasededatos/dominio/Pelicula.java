package com.example.proyectointermodularprogramacionbasededatos.dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BD_peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min=3, max=100)
    private String titulo;
    private String genero;
    @Max(2030)
    @Min(1895)
    private int anho;
    @Transient
    String categoriaVisual;

    @OneToMany(mappedBy = "pelicula")
    private List<Actor> actores = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "pelicula_director",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<Director> directores = new ArrayList<>();

    public Pelicula(Long id, String titulo, String genero, int anho, String categoriaVisual) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anho = anho;
        this.categoriaVisual = categoriaVisual;
    }

}
