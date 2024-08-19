package ar.unlu.edu.poo.biblioteca;


import java.util.ArrayList;

public class Libro {
    private final String titulo;
    private final int paginas;
    private final String isbn;
    private final ArrayList<Ejemplar> ejemplares;

    //chequear si faltaria agregar un array de ejemplares

    public Libro(String titulo, int paginas, String isbn) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.isbn = isbn;
        ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public ArrayList<Ejemplar> getEjemplares(){
        return this.ejemplares;
    }
}
