// LinkedList.java
/**
 * Implementación de una lista enlazada simple.
 */
public class LinkedList {
    // Referencia al primer nodo de la lista
    private Node head;
    
    /**
     * Constructor para crear una lista enlazada vacía.
     */
    public LinkedList() {
        this.head = null;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado al final de la lista.
     * @param data El valor a agregar
     */
    public void add(int data) {
        // Crear un nuevo nodo
        Node newNode = new Node(data);
        
        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
        if (head == null) {
            head = newNode;
            return;
        }
        
        // De lo contrario, recorrer la lista hasta el último nodo
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Enlazar el último nodo con el nuevo nodo
        current.next = newNode;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado al inicio de la lista.
     * @param data El valor a agregar
     */
    public void addFirst(int data) {
        // Crear un nuevo nodo
        Node newNode = new Node(data);
        
        // El siguiente del nuevo nodo será la cabeza actual
        newNode.next = head;
        
        // El nuevo nodo se convierte en la cabeza
        head = newNode;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado en una posición específica.
     * @param data El valor a agregar
     * @param position La posición donde agregar el nodo (0-indexado)
     */
    public void addMiddle(int data, int position) {
        // Si la posición es 0, usar addFirst
        if (position == 0) {
            addFirst(data);
            return;
        }
        
        // Crear un nuevo nodo
        Node newNode = new Node(data);
        
        // Recorrer la lista hasta la posición deseada
        Node current = head;
        int count = 0;
        
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        
        // Si la posición es válida
        if (current != null) {
            // Insertar el nuevo nodo
            newNode.next = current.next;
            current.next = newNode;
        } else {
            // Si la posición es mayor que el tamaño de la lista, agregar al final
            add(data);
        }
    }
    
    /**
     * Elimina la primera ocurrencia del nodo con el valor especificado.
     * @param data El valor a eliminar
     */
    public void remove(int data) {
        // Si la lista está vacía, no hay nada que eliminar
        if (head == null) {
            return;
        }
        
        // Si la cabeza tiene el valor buscado
        if (head.data == data) {
            head = head.next;
            return;
        }
        
        // Buscar el nodo con el valor especificado
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        
        // Si se encontró el valor, eliminar el nodo
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    /**
     * Imprime todos los valores de la lista.
     */
    public void printList() {
        Node current = head;
        
        System.out.print("Lista: ");
        
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        System.out.println();
    }
    
    /**
     * Invierte el orden de la lista enlazada.
     */
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            // Guardar el siguiente nodo
            next = current.next;
            
            // Invertir la referencia del nodo actual
            current.next = prev;
            
            // Mover los punteros una posición adelante
            prev = current;
            current = next;
        }
        
        // La nueva cabeza es el último nodo procesado
        head = prev;
    }
    
    /**
     * Verifica si un valor existe en la lista.
     * @param value El valor a buscar
     * @return true si el valor está en la lista, false en caso contrario
     */
    public boolean contains(int value) {
        Node current = head;
        
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
}