package ar.unlu.edu.poo.biblioteca;

public class App {



    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.altaAutor("Nico","Argentino");
        biblioteca.altaLibro("Nico","hola",10,"hola");
        biblioteca.altaLibro("Nico","chau",1,"hola-chau");
        String libros = biblioteca.buscarLibroPorAutor("Nico");
        var librosA = libros.split("\n");
        System.out.println(compararPags(librosA[0],librosA[1]));


    }

    public static String compararPags(String a,String b){
        var pagsA = a.split("tiene ")[1].split(" ")[0];
        var pagsB = b.split("tiene ")[1].split(" ")[0];
        if (Integer.parseInt(pagsA) > Integer.parseInt(pagsB)){
            return "Mayor";
        }
        if (Integer.parseInt(pagsA) < Integer.parseInt(pagsB)){
            return "Menor";
        }
        return "Igual";
    }
}
