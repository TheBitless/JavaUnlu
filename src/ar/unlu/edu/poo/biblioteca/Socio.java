package ar.unlu.edu.poo.biblioteca;

import java.util.ArrayList;

public class Socio {
    private final int id;
    private final String nombre;
    private ArrayList<Prestamo> prestamos;

    public Socio(int id,String nombre) {
        this.id = id;
        this.nombre = nombre;
        prestamos = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    public static Socio buscarSocio(ArrayList<Socio> socios,int id){
        for (Socio socio : socios){
            if (socio.id == id){
                return socio;
            }
        }
        return null;
    }

    public Prestamo buscarPrestamo(String titulo) {
        for (Prestamo prestamo : prestamos){
            if (titulo.equals(prestamo.getEjemplar().getLibro().getTitulo()) && prestamo.getFechaDevolucion() == null){
                return prestamo;
            }
        }
        return null;
    }
}
