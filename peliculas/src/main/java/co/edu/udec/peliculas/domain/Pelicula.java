package co.edu.udec.peliculas.domain;

public class Pelicula {
    private int id;
    private String titulo;  
    private int lanzamiento;
    private String genero;


    public Pelicula(int id, String titulo, int lanzamiento, String genero){
        this.id = id;
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.genero = genero;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getLanzamiento() {
        return lanzamiento;
    }
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String toString() {
        return id + " - " + titulo + " (" + lanzamiento + ") - " + genero;
    }
    
}
