public class Pila {
    private SingleLinkNode tope;
    private int cantidad;

    public Pila(){
        this.tope = null;
        this.cantidad = 0;
    }

    public void apilar(int valor){
        if (this.tope == null){
            this.tope = new SingleLinkNode(valor);
            this.cantidad++;
        }
        else{
            getLastNodo().setSiguiente(new SingleLinkNode(valor));
            this.cantidad++;
        }
    }

    private SingleLinkNode getLastNodo() {
        SingleLinkNode actual = tope;
        while (actual.hasSiguiente()){
            actual = actual.getSiguiente();
        }
        return  actual;
    }

    public int desapilar(){
        int result = tope.getValor();
        tope = tope.getSiguiente();
        return result;
    }

    public boolean isEmpty(){
        return cantidad == 0;
    }

    public void mover(Pila aux){
        while(!this.isEmpty()){
            aux.apilar(this.desapilar());
        }
    }

    public boolean buscar(int valor) {
        Pila aux = new Pila();
        boolean result = false;
        while(!this.isEmpty()){
            int dato = this.desapilar();
            aux.apilar(dato);
            if (dato == valor){
                result = true;
            }
        }
        aux.mover(this);
        return result;
    }
}
