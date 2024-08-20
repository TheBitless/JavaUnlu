package ar.unlu.edu.poo.biblioteca;

public class Ejemplar {
    private boolean disponible;
    private int idPrestamo;
    private Libro libro;

    public Ejemplar(Libro libro) {
        disponible = true;
        this.libro=libro;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public int getIdPrestamo() {
        return this.idPrestamo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
}
