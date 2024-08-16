import javax.naming.ldap.spi.LdapDnsProvider;

public class DoubleLinkNode{
    /**
     * Nodo siguiente a este nodo
     */
    private DoubleLinkNode siguiente;

    private DoubleLinkNode anterior;

    private final int valor;

    public DoubleLinkNode(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setSiguiente(DoubleLinkNode nodo){
        this.siguiente = nodo;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public DoubleLinkNode getSiguiente() {
        return this.siguiente;
    }

    public boolean isEqual(int valor) {
        return this.valor == valor;
    }


    public void setAnterior(DoubleLinkNode anterior) {
        this.anterior = anterior;
    }

    public DoubleLinkNode getAnterior() {
        return this.anterior;
    }
}
