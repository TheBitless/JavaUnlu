package ar.unlu.edu.poo.joaco;

public class NodoPila {
    private NodoPila siguiente;
    private final int valor;

    public NodoPila(int valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoPila nodo) {
        this.siguiente=nodo;
    }

    public int getValor(){
        return  this.valor;
    }
}
