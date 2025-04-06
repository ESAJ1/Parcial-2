public class Main {
    public static void main(String[] args) {
        // Crear una nueva lista enlazada
        LinkedList list = new LinkedList();
        
        System.out.println("DEMOSTRACIÓN DE LISTA ENLAZADA");
        System.out.println("========================================");
        
        // 1. Agregar el número 0 al inicio de la lista
        System.out.println("1. Agregando el número 0 al inicio de la lista");
        list.addFirst(0);
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 2. Agregar el número 2 al final de la lista
        System.out.println("2. Agregando el número 2 al final de la lista");
        list.add(2);
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 3. Agregar el número 4 al medio de la lista (en la posición 1)
        System.out.println("3. Agregando el número 4 en la posición 1");
        list.addMiddle(4, 1);
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 4. Mostrar la lista actual
        System.out.println("4. Mostrando la lista actual");
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 5. Remover el número 2 de la lista
        System.out.println("5. Removiendo el número 2 de la lista");
        list.remove(2);
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 6. Mostrar la lista después de la eliminación
        System.out.println("6. Mostrando la lista después de la eliminación");
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 7. Agregar el número 6 al final de la lista
        System.out.println("7. Agregando el número 6 al final de la lista");
        list.add(6);
        System.out.print("   ");
        list.printList();
        System.out.println();
        
        // 8. Verificar si el número 4 está en la lista
        System.out.println("8. Verificando si el número 4 está en la lista");
        boolean contains4 = list.contains(4);
        System.out.println("   ¿La lista contiene el número 4? " + contains4);
        System.out.println();
        
        // 9. Verificar si el número 8 está en la lista
        System.out.println("9. Verificando si el número 8 está en la lista");
        boolean contains8 = list.contains(8);
        System.out.println("   ¿La lista contiene el número 8? " + contains8);
        System.out.println();
        
        // 10. Revertir la lista
        System.out.println("10. Revirtiendo la lista");
        list.reverse();
        System.out.print("    ");
        list.printList();
        System.out.println();
        
        // 11. Mostrar la lista después de revertir
        System.out.println("11. Mostrando la lista después de revertir");
        System.out.print("    ");
        list.printList();
        System.out.println();
        
        // 12. Agregar el número 8 al inicio de la lista
        System.out.println("12. Agregando el número 8 al inicio de la lista");
        list.addFirst(8);
        System.out.print("    ");
        list.printList();
        System.out.println();
        
        // 13. Mostrar la lista final
        System.out.println("13. Mostrando la lista final");
        System.out.print("    ");
        list.printList();
        System.out.println("\n========================================");
    }
}