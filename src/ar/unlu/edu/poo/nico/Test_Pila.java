package ar.unlu.edu.poo.nico;

public class Test_Pila {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        if (pila.desapilar() != 3){
            throw new AssertionError("No anda el desapilar/apilar :P");
        }
        System.out.println("Test: desapilar//apilar Paso!!");

        if (!pila.toString().equals("2, 1")){
            throw new AssertionError("Error en la funcion:  toString");
        };
        System.out.println("Test: toString Paso!!");

        pila.desapilar();pila.desapilar();

        if (!pila.estaVacia()){
            throw new AssertionError("Error en la funcion: estaVacia");
        };
        System.out.println("Test: estaVacia Paso!!");
    }
}
