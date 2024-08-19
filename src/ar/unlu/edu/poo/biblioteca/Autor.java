package ar.unlu.edu.poo.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Autor {
    private final String nombre;
    private final String nacionalidad;
    private final ArrayList<Libro> libros;

    public Autor( String nombre,String nacionalidad) {
        libros = new ArrayList<>();
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    public static Autor buscarAutor(ArrayList<Autor> autores,String nombre){
        for (Autor autor : autores){
            if (autor.nombre.equals(nombre)){
                return autor;
            }
        }
        return null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public void agregarLibro(String titulo,int pags,String isbn) {
        libros.add(new Libro(titulo,pags,isbn));
    }

}
