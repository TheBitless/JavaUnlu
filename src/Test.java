public class Test {
    public static void main(String[] args) {
        DoubleLinkNode a = new  DoubleLinkNode(2);
        System.out.println(a.getSiguiente());
        a.setSiguiente(a);
        a.setSiguiente(a);
    }
}
