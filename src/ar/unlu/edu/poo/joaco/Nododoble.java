package ar.unlu.edu.poo.joaco;

public class Nododoble {
    private Nododoble siguiente;
    private Nododoble anterior;
    private final int valor;

    public Nododoble(int valor){
        this.valor=valor;
    }

    public boolean hasSiguiente(){
        return this.siguiente != null;
    }

    public boolean valorIs(int valor){
        return this.valor == valor;
    }

    public int getValor(){
        return this.valor;
    }

    public Nododoble getSiguiente(){
        return  this.siguiente;
    }
    public Nododoble getAnterior(){
        return this.anterior;
    }

    public void setSiguiente(Nododoble nodo){
        this.siguiente= nodo;
    }
    public void setAnterior(Nododoble nodo){
        this.anterior= nodo;
    }
}
