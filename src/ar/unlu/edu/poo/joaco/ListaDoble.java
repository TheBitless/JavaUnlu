package ar.unlu.edu.poo.joaco;

public class ListaDoble {
    private Nododoble inicio;
    private int cantidadElementos;

    public ListaDoble(){
        this.cantidadElementos=0;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int longitud(){
        return this.cantidadElementos;
    }

    public void agregar(int valor){
        Nododoble nuevoNodo= new Nododoble(valor);
        if (this.estaVacia()){
            this.cantidadElementos++;
            this.inicio= nuevoNodo;
            return;
        }
        else{
            Nododoble nodoActual=this.inicio;
            while(nodoActual.hasSiguiente() || nodoActual.valorIs(valor) ){
                nodoActual= nodoActual.getSiguiente();
            }
            if (!nodoActual.hasSiguiente() && !nodoActual.valorIs(valor)) {
                nodoActual.setSiguiente(nuevoNodo);
                this.cantidadElementos++;
                nuevoNodo.setAnterior(nodoActual);
            }
        }
    }

    public void eliminar(int valor) {
        if (estaVacia()) {
            return;
        }
        Nododoble nodoActual = this.inicio;
        if (nodoActual.valorIs(valor)) {
            this.inicio = nodoActual.getSiguiente();
            nodoActual.getSiguiente().setAnterior(null);
            this.cantidadElementos--;
            return;
        } else {
            boolean bandera = true;
            while (nodoActual.hasSiguiente() && bandera){
                if (nodoActual.valorIs(valor)){
                    bandera=false;
                    nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
                    nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
                    this.cantidadElementos--;
                }
                else{
                    nodoActual= nodoActual.getSiguiente();
                }
            }
            
        }
    }
    public int recuperar(int posicion){
        if (posicion >longitud() || estaVacia()){
            return  -111111111;
        }
        Nododoble nodoActual=this.inicio;
        int i=0;
        while (nodoActual.hasSiguiente() && posicion-1 != i){
            nodoActual= nodoActual.getSiguiente();
            i++;
        }
        return nodoActual.getValor();
    }

    public void insertar(int valor,int posicion){
        Nododoble nuevoNodo= new Nododoble (valor);
        if (estaVacia()){
            this.inicio=nuevoNodo;
            this.cantidadElementos++;
        }

        Nododoble nodoActual = this.inicio;
        if (posicion > this.cantidadElementos) {
            agregar(valor);
        }
        else if(posicion == 1){
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio.setAnterior(nuevoNodo);
            this.inicio=nuevoNodo;
            this.cantidadElementos++;
        }
        else {
            int i = 0;
            while (nodoActual.hasSiguiente() && posicion-1 != i) {
                nodoActual = nodoActual.getSiguiente();
                i++;
            }
            nuevoNodo.setSiguiente(nodoActual);
            nuevoNodo.setAnterior(nodoActual.getAnterior());
            nodoActual.getAnterior().setSiguiente(nuevoNodo);
            nodoActual.setAnterior(nuevoNodo);
            this.cantidadElementos++;
        }
    }

    public void mostrarLista(){

        System.out.print("[ ");
        Nododoble nodoActual=this.inicio;
        //System.out.print(nodoActual.getValor());
        for (int i= 0; i < longitud();i++){
            System.out.print(nodoActual.getValor());
            nodoActual=nodoActual.getSiguiente();
        }
        System.out.println(" ]");
    }



}
