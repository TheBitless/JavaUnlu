package ar.unlu.edu.poo.biblioteca;

public class Ejemplar {
    private boolean disponible;
    private Prestamo idPrestamo;
    private final Libro libro;

    public Ejemplar(Libro libro) {
        disponible = true;
        this.libro=libro;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public Prestamo getIdPrestamo() {
        return this.idPrestamo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setIdPrestamo(Prestamo idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Libro getLibro() {
        return this.libro;
    }


}
