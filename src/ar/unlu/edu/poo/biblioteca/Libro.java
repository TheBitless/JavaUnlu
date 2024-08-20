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

    public static Libro buscarLibro(ArrayList<Libro> libros, String titulo) {
        for(Libro libro : libros){
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
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

    public void agregarEjemplar() {
        ejemplares.add(new Ejemplar(this));
    }

    public Ejemplar getDisponible(){
        int contador = 0;
        for (Ejemplar ejemplar : ejemplares){
            if ()
        }
    }
}
