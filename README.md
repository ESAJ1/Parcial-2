# Parcial-2
Proyecto Estructura de datos: Listas Enlazadas simples.
# Lista Enlazada Simple en Java

Este proyecto implementa una lista enlazada simple en Java con las operaciones básicas de manipulación. La implementación demuestra la comprensión de memoria dinámica, el uso de referencias y la implementación de métodos fundamentales

## Estructura del Proyecto

El proyecto consta de tres clases principales:

1. `Node.java`: Define la estructura de un nodo en la lista enlazada
2. `LinkedList.java`: Implementa las operaciones de la lista enlazada
3. `Main.java`: Clase principal que demuestra el uso de la lista enlazada

## Funcionalidades Implementadas

La clase `LinkedList` implementa los siguientes métodos:

- `add(int data)`: Agrega un nodo al final de la lista
- `addFirst(int data)`: Agrega un nodo al inicio de la lista
- `addMiddle(int data, int position)`: Agrega un nodo en una posición específica
- `remove(int data)`: Elimina el nodo que contiene el valor especificado
- `printList()`: Muestra los elementos de la lista
- `reverse()`: Invierte el orden de la lista
- `contains(int value)`: Verifica si un valor existe en la lista

## Cómo Ejecutar el Código

### Requisitos
- Java JDK 8 o superior
- Un IDE como IntelliJ IDEA, Eclipse, o NetBeans (opcional)

### Pasos para Ejecutar

1. Clonar el repositorio:
   ```
   git clone https://github.com/ESAJ1/Parcial-2
   cd Parcial-2
   ```

2. Compilar el código:
   ```
   javac Node.java LinkedList.java Main.java
   ```

3. Ejecutar la aplicación:
   ```
   java Main
   ```

## Ejemplo de Uso

El programa de ejemplo utiliza un DNI ficticio para demostrar las operaciones de la lista enlazada. Realiza las siguientes acciones:

1. Agrega cada dígito del DNI a la lista
2. Agrega un valor al inicio de la lista
3. Agrega un valor en una posición intermedia
4. Verifica si la lista contiene un valor específico
5. Elimina un valor de la lista
6. Invierte la lista
7. Intenta eliminar un valor que no existe

## Notas de Implementación

- La clase `Node` contiene un valor entero (`data`) y una referencia al siguiente nodo (`next`).
- La lista se implementa manteniendo una referencia al primer nodo (`head`).
- Las operaciones de la lista realizan los ajustes necesarios en las referencias para mantener la estructura correcta.
- Se manejan casos especiales como listas vacías y operaciones en el primer o último elemento.
