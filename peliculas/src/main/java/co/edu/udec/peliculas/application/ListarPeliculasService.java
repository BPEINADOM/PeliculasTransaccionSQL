package co.edu.udec.peliculas.application;

import java.util.List;

import co.edu.udec.peliculas.domain.Pelicula;
import co.edu.udec.peliculas.domain.PeliculaRepository;

public class ListarPeliculasService {

    private final PeliculaRepository peliculaRepository;

    public ListarPeliculasService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public void listar() {
        List<Pelicula> peliculas = peliculaRepository.listarTodas();
        System.out.println("Listado de peliculas:");
        peliculas.forEach(System.out::println);
    }
}
