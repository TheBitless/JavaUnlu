package ar.unlu.edu.poo.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Biblioteca {
    private final ArrayList<Autor> autores;
    private final ArrayList<Socio> socios;

    public Biblioteca() {
        autores = new ArrayList<>();
        socios = new ArrayList<>();
    }

    public void altaSocio(int id,String nombre){
        socios.add(new Socio(id,nombre));
    }

    public void bajaSocio(int id){
        socios.remove(Socio.buscarSocio(socios,id));
    }

    public void altaAutor(String nombre,String nacionalidad){
        autores.add(new Autor(nombre,nacionalidad));
    }



    public void altaLibro(String autor, String titulo,int pags,String isbn){
        Autor autorAlta = Autor.buscarAutor(autores,autor);
        if (autorAlta != null){
            autorAlta.agregarLibro(titulo,pags,isbn);
            }
        else{
            System.out.println("Antes de dar de alta un libro debe dar de alta su autor.");
        }

//    public void altaEjemplar(String titulo){
//        agregarEjemplar
//    }
}
