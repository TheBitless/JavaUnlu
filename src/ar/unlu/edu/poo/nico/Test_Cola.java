package ar.unlu.edu.poo.nico;

public class Test_Cola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        if (cola.desencolar() != 1){
            throw new AssertionError("Error en el encolar//desencolar");
        };
        System.out.println("Test: desencolar//encolar Paso!!");

        if (!cola.toString().equals("2, 3")){
            throw new AssertionError("Error en el toString");
        }
        System.out.println("Test: toString Paso!!");
    }
}
