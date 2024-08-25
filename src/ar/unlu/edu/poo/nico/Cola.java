package ar.unlu.edu.poo.nico;



public class Cola {
    private Nodo inicio;
    private Nodo end;
    private int cantidadElementos;

    public Cola() {
        this.cantidadElementos = 0;
        this.inicio = null;
        this.end = null;
    }

    public boolean isEmpty(){
        return cantidadElementos == 0;
    }

    private boolean buscar(int x){
        Nodo temp=this.inicio;
        for (int i = 1; i < cantidadElementos; i++) {
            if (temp.valorIs(x)){
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }

    public void encolar(int valor){
        Nodo nuevoNodo= new Nodo(valor);
        if (buscar(valor)){
            return;
        }
        else if (isEmpty()){
           this.inicio=nuevoNodo;
        }
        else{
            this.end.setSiguiente(nuevoNodo);
        }
        this.end=nuevoNodo;
        this.cantidadElementos++;
    }

    public int desencolar(){
        if (isEmpty()){
            throw new RuntimeException("la cola esta vacia");
        }
        Nodo resultado= this.inicio;
        this.inicio= resultado.getSiguiente();
        this.cantidadElementos--;
        return resultado.getValor();
    }

    public String toString(){
        String resultado = "";
        Nodo nodoactual = inicio;
        boolean centinela = true;
        while(centinela){
            resultado += nodoactual.getValor();
            nodoactual = nodoactual.getSiguiente();
            centinela = nodoactual != null;
            if (centinela){
                resultado += ", ";
            }
        }
        return resultado;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }
}
