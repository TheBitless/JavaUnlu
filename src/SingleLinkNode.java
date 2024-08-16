public class SingleLinkNode{
    /**
     * Nodo siguiente a este nodo
     */
    private SingleLinkNode siguiente;

    private final int valor;

    public SingleLinkNode(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setSiguiente(SingleLinkNode nodo){
        this.siguiente = nodo;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public SingleLinkNode getSiguiente() {
        return this.siguiente;
    }

    public boolean isEqual(int valor) {
        return this.valor == valor;
    }

}
