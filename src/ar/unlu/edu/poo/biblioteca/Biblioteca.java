package ar.unlu.edu.poo.biblioteca;

import java.io.IOException;
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



    public void altaLibro(String autor, String titulo,int pags,String isbn) {
        Autor autorAlta = Autor.buscarAutor(autores, autor);
        if (autorAlta != null) {
            autorAlta.agregarLibro(titulo, pags, isbn);
        } else {
            System.out.println("Antes de dar de alta un libro debe dar de alta su autor.");
        }
    }

    public void altaEjemplar(String titulo){
        Libro buscado = Autor.buscarLibro(autores,titulo);
        if (buscado != null){
            buscado.agregarEjemplar();
        }
        else{
            System.out.println("Antes de dar de alta un ejemplar debe dar de alta su libro.");
        }
    }

    public void cargarPrestamo(int idSocio,String titulo){
        Libro libro = Autor.buscarLibro(autores,titulo);
        if (libro == null){
            System.out.println("Libro no existente en la biblioteca");
            return;
        }

        Ejemplar ejemplar = libro.getDisponible();
        if (ejemplar == null){
            System.out.println("No hay suficientes ejemplares como para prestar");
            return;
        }

        Socio socio = Socio.buscarSocio(socios, idSocio);
        if (socio == null){
            System.out.println("El socio no existe");
            return;
        }

        Prestamo prestamo = new Prestamo(socio,ejemplar);


    }

    public void devolverPrestamo(int idSocio,String titulo){
        Prestamo.devolverPrestamo(socios,idSocio,titulo);
    }

    public String buscarLibroPorAutor(String autor){
        StringBuilder resultado = new StringBuilder();
        for (Autor aux : autores){
            if (aux.getNombre().equals(autor)){
                resultado.append(aux.mostrarLibros());
            }
        }
        return resultado.toString();
    }

    public void buscarLibroPorNombre(String titulo){
        String resultado;
        try{
            Autor.buscarLibro(autores,titulo).mostrar(Autor.buscarAutorPorLibro(autores,titulo).getNombre());
        }
        catch(Exception e){
            System.err.println("El libro buscado no existe, " + e.toString());
        }
    }

    public int cantidadPrestamos(){
        var resultado = 0;
        for(Socio socio : socios){
            resultado += socio.getPrestamos().size();
        }
        return resultado;
    }
}
