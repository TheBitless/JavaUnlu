package ar.unlu.edu.poo.nico;

public class Test_lista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        if (lista.buscar(2)){
            throw new AssertionError("Error en la funcion: Buscar (Buscando en una lista vacia)");
        }

        lista.agregar(1); lista.agregar(2); lista.agregar(3);

        if (!lista.buscar(2)){
            throw new AssertionError("Error en la funcion: Buscar (Resultado esperado: True)");
        }
        if (lista.buscar(4)){
            throw new AssertionError("Error en la funcion: Buscar (Resultado esperado: False)");
        }
        System.out.println("Test: toString Paso!!");

        if (lista.recuperar(1) != 1){
            throw new AssertionError("Error en la funcion: recuperar");
        }
        if (lista.recuperar(2) != 2){
            throw new AssertionError("Error en la funcion: recuperar");
        }
        if (lista.longitud() != 3){
            throw new AssertionError("Error en la funcion: longitud");
        }
        System.out.println("Test: toString Paso!!");
        System.out.println("Test: longitud Paso!!");

        lista.eliminar(3);

        if (lista.buscar(3)){
            throw new AssertionError("Error en la funcion: eliminar");
        }
        System.out.println("Test: eliminar Paso!!");

        lista.insertar(3,2);

        if (!lista.toString().equals("1, 3, 2")){
            throw new AssertionError("Error en la funcion: insertar / toString");
        }
        System.out.println("Test: insertar / toString Paso!!");
    }
}
