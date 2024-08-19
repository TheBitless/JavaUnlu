import ar.unlu.edu.poo.joaco.*;



public class Main {
    public static void testListaSimple() {
        Lista lista = new Lista();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);


//        lista.eliminar(1);
//
//
//        lista.insertar(4,4);
//        lista.insertar(0,1);
//        lista.insertar(9,2);

//      System.out.print( lista.recuperar(4));

        lista.mostrarLista();

    }

    public static void testListadoble(){
        ListaDoble lista = new ListaDoble();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);


//        lista.eliminar(1);
//        lista.eliminar(2);
//        lista.eliminar(3);
//
//
//        lista.insertar(4,4);
//      lista.insertar(0,1);
//        lista.insertar(9,2);

        System.out.println( lista.recuperar(4));
        System.out.println( lista.recuperar(1));
        System.out.println( lista.recuperar(2));
      lista.mostrarLista();

    }
    public static void main(String[] args){
        testListaSimple();
        //testListadoble();
    }
}