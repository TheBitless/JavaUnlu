package ar.unlu.edu.poo.joaco;

public class Test_lista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        if (!lista.buscar(2)){
            throw new AssertionError("Error en la funcion: Buscar");
        }

        lista.agregar(1); lista.agregar(2); lista.agregar(3);

    }
}
