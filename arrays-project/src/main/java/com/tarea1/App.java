package com.tarea1;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
    	// a) "Hola mundo"
        System.out.println("Hola mundo");
        
        // b) multiplicacion de dos numeros
        int num1 =5;
        int num2 =8;
        int resultado = num1*num2;
        System.out.println("El resultado:" + resultado);
        
        /*
        ===========================================================
        INVESTIGACIÓN: ARREGLOS EN JAVA
        ===========================================================

        4.1 ¿Cómo se declara un arreglo en Java?

        Un arreglo (array) es una estructura que permite almacenar varios valores del mismo tipo
        en una sola variable. Los arreglos tienen un tamaño fijo que se define al momento de crearlos.

        Forma 1: Declarar el arreglo con tamaño definido

        int[] numeros = new int[5]; // Se crea un arreglo con 5 espacios

        // Asignación de valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        Forma 2: Declarar e inicializar directamente con valores

        int[] valores = {1, 2, 3, 4, 5};


        Forma 3: Otra forma válida de declaración

        int edades[] = new int[3];
        edades[0] = 18;
        edades[1] = 20;
        edades[2] = 22;


        ===========================================================
        4.2 Métodos y utilidades principales para arreglos (java.util.Arrays)
        ===========================================================

        Primero se debe importar la clase:

        import java.util.Arrays;


        1. Arrays.sort() → Ordena los elementos del arreglo

        int[] datos = {5, 2, 8, 1, 3};

        Arrays.sort(datos);

        System.out.println(Arrays.toString(datos));
        // Resultado: [1, 2, 3, 5, 8]


        -----------------------------------------------------------

        2. Arrays.binarySearch() → Busca un elemento en el arreglo

        int[] datos = {1, 2, 3, 5, 8};

        int posicion = Arrays.binarySearch(datos, 5);

        System.out.println("Posición: " + posicion);
        // Resultado: Posición: 3


        -----------------------------------------------------------

        3. Arrays.copyOf() → Copia un arreglo

        int[] original = {10, 20, 30};

        int[] copia = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(copia));
        // Resultado: [10, 20, 30]


        -----------------------------------------------------------

        4. Arrays.fill() → Llena el arreglo con un valor

        int[] numeros = new int[5];

        Arrays.fill(numeros, 100);

        System.out.println(Arrays.toString(numeros));
        // Resultado: [100, 100, 100, 100, 100]


        -----------------------------------------------------------

        5. Arrays.equals() → Compara dos arreglos

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean iguales = Arrays.equals(a, b);

        System.out.println("¿Son iguales? " + iguales);
        // Resultado: true


        -----------------------------------------------------------

        6. Arrays.toString() → Convierte el arreglo a texto

        int[] numeros = {10, 20, 30};

        System.out.println(Arrays.toString(numeros));
        // Resultado: [10, 20, 30]


        -----------------------------------------------------------

        7. Arrays.stream() → Permite recorrer el arreglo usando streams

        int[] numeros = {1, 2, 3, 4, 5};

        Arrays.stream(numeros).forEach(System.out::println);

        // Resultado:
        // 1
        // 2
        // 3
        // 4
        // 5


        ===========================================================
        4.3 ¿Cómo se recorren los arreglos en Java?
        ===========================================================

        Forma 1: For tradicional (usa índices)

        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }


        -----------------------------------------------------------

        Forma 2: For-each (más simple)

        int[] numeros = {10, 20, 30, 40, 50};

        for (int numero : numeros) {
            System.out.println(numero);
        }


        -----------------------------------------------------------

        Forma 3: Usando Streams

        import java.util.Arrays;

        int[] numeros = {10, 20, 30, 40, 50};

        Arrays.stream(numeros).forEach(n -> {
            System.out.println(n);
        });


        ===========================================================
        4.4 Diferencias entre Arreglos y ArrayList
        ===========================================================

        1. Tamaño

        Arreglos → tamaño fijo

        int[] numeros = new int[5];


        ArrayList → tamaño dinámico

        import java.util.ArrayList;

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);


        -----------------------------------------------------------

        2. Tipos primitivos

        Arreglos permiten tipos primitivos:

        int[] numeros = {1, 2, 3};


        ArrayList usa clases envolventes:

        ArrayList<Integer> lista = new ArrayList<>();


        -----------------------------------------------------------

        3. Métodos disponibles

        Arreglos:

        numeros.length


        ArrayList:

        lista.add(10);
        lista.remove(0);
        lista.get(0);
        lista.size();


        -----------------------------------------------------------

        4. Rendimiento

        Arreglos:

        - Más rápidos
        - Usan menos memoria
        - Mejor rendimiento


        ArrayList:

        - Más flexible
        - Permite agregar y eliminar elementos
        - Un poco más lento que los arreglos


        -----------------------------------------------------------

        5. ¿Cuándo usar cada uno?

        Usar arreglos cuando:

        - El tamaño es fijo
        - Se necesita mayor velocidad

        Ejemplo:

        int[] edades = new int[10];


        Usar ArrayList cuando:

        - El tamaño cambia constantemente
        - Se agregan o eliminan elementos

        Ejemplo:

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luis");

*/
     

    }
}