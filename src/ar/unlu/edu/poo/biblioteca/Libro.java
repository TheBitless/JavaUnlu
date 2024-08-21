package ar.unlu.edu.poo.biblioteca;


import java.util.ArrayList;

public class Libro {
    private final String titulo;
    private final int paginas;
    private final String isbn;
    private final ArrayList<Ejemplar> ejemplares;

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
            if (ejemplar.isDisponible()){
                if (contador++ > 1){
                    return ejemplar;
                }
            }
        }
        return null;
    }

    public int ejemplaresDisponibles(){
        int contador = 0;
        for (Ejemplar ejemplar : ejemplares){
            contador += ejemplar.isDisponible()? 1:0;
        }
        return contador;
    }

    public String mostrar(String autor) {
        return "El libro " + this.titulo + " creado por el autor " + autor + " tiene " + this.paginas + " páginas, quedan " + this.ejemplaresDisponibles() + " disponibles y se prestaron " + (this.ejemplares.size() - this.ejemplaresDisponibles());
    }
}
