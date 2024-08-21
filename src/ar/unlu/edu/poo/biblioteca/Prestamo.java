package ar.unlu.edu.poo.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private final Ejemplar ejemplar;
    private final Socio socio;
    private final String fechaEntrega;
    private String fechaDevolucion;

    public Prestamo(Socio socio,Ejemplar ejemplar){
        this.socio=socio;
        this.ejemplar=ejemplar;
        fechaEntrega = LocalDate.now().toString();

        socio.getPrestamos().add(this);
        ejemplar.setIdPrestamo(this);

        ejemplar.setDisponible(false);
    }

    public static void devolverPrestamo(ArrayList<Socio> socios, int idSocio, String titulo){
        Socio socio = Socio.buscarSocio(socios,idSocio);
        if (socio == null){
            System.out.println("el socio no existe");
            return;
        }
        Prestamo prestamo = socio.buscarPrestamo(titulo);

        prestamo.fechaDevolucion = LocalDate.now().toString();
        prestamo.ejemplar.setDisponible(true);
        prestamo.ejemplar.setIdPrestamo(null);
    }

    public Ejemplar getEjemplar() {
        return this.ejemplar;
    }

    public Socio getSocio() {
        return this.socio;
    }

    public String getFechaEntrega() {
        return this.fechaEntrega;
    }

    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }
}
