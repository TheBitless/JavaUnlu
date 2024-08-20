package ar.unlu.edu.poo.biblioteca;

import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Socio socio;
    private String fechaDevolucion;
    private String fechaEntrega;

    public Prestamo(Ejemplar ejemplar,Socio socio){
        this.socio=socio;
        this.ejemplar=ejemplar;
    }
}
