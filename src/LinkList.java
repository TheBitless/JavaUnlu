public class LinkList {
    private LinkNode inicio;

    private int cantidadElementos;

    public LinkList() {
        this.cantidadElementos = 0;
    }

    public void agregar(int valor){
        LinkNode nuevoNodo = new LinkNode(valor);
        if(this.estaVacia()){
            this.inicio = nuevoNodo;
            this.cantidadElementos++;
        }else{
            LinkNode nodoActual = this.inicio;
            while (nodoActual.isEqual(valor) || !nodoActual.hasSiguiente()){
                nodoActual = nodoActual.getSiguiente();
            }
            if(!nodoActual.hasSiguiente() && !nodoActual.isEqual(valor)){
                nodoActual.setSiguiente(nuevoNodo);
                this.cantidadElementos++;
            }
        }
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void eliminar(int valor){
        if (estaVacia()){
            return;
        }
        else if (inicio.isEqual(valor)){
            this.inicio = this.inicio.getSiguiente();
            this.cantidadElementos--;
        }
        else{
            LinkNode nodoActual = this.inicio;
            boolean centinel = true;
            while (nodoActual.hasSiguiente() && centinel){
                if (nodoActual.getSiguiente().isEqual(valor)){
                    centinel = false;
                    nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                    this.cantidadElementos--;
                }
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }

    public int recuperar(int index){
        if (estaVacia()){
            throw new ArrayStoreException("la lista esta vacia");
        }
        return nodoOf(index).getValor();
    }

    /**
     * Retorna el nodo del indice indicado !=
     */
    private LinkNode nodoOf(int index) {
        LinkNode actual = inicio;
        for (int i = 0; i < index - 1; i++) {
            if (!actual.hasSiguiente()){
                throw  new ArrayIndexOutOfBoundsException("no existe el indice");
            }
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public void insertar(int valor,int index){
        if (index > this.cantidadElementos){
            agregar(valor);
        }
        else if (index == 1){
            inicio = new LinkNode(valor);
            this.cantidadElementos++;
        }
        else{
            LinkNode actual = nodoOf(index - 1);
            LinkNode aux = actual.getSiguiente();
            actual.setSiguiente(new LinkNode(valor));
            actual.getSiguiente().setSiguiente(aux);
            this.cantidadElementos++;
        }
    }

    public boolean buscar(int valor){
        if (estaVacia()){
            return false;
        }
        boolean centinel = true;
        LinkNode nodoActual = inicio;
        while (nodoActual.hasSiguiente() && centinel){
            if (nodoActual.isEqual(valor)){
                centinel = false;
            }
        }
        return !centinel;
    }


}
