public class DoubleLinkNode extends SingleLinkNode{
    private DoubleLinkNode anterior;
    private DoubleLinkNode siguiente;

    public DoubleLinkNode(int valor){
        super(valor);
        this.anterior = null;
    }
    public void setAnterior(DoubleLinkNode nodo){
        this.anterior = nodo;
    }

    public DoubleLinkNode getAnterior() {
        return anterior;
    }
}
