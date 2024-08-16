public class LinkNode {
    /**
     * Nodo siguiente a este nodo
     */
    private LinkNode siguiente;

    private final int valor;

    public LinkNode(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setSiguiente(LinkNode nodo){
        this.siguiente = nodo;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public LinkNode getSiguiente() {
        return this.siguiente;
    }

    public boolean isEqual(int valor) {
        return this.valor == valor;
    }

}
