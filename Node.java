// Node.java
/**
 * Clase que representa un nodo en una lista enlazada simple.
 */
public class Node {
    int data; // Valor almacenado en el nodo
    Node next; // Referencia al siguiente nodo

    /**
     * Constructor que inicializa un nodo con un valor específico.
     * @param data El valor a almacenar en el nodo
     */
    public Node(int data) {
        this.data = data;
        this.next = null; // Al crear un nodo, no tiene siguiente
    }
}
