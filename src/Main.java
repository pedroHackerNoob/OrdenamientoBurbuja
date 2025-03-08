public class Main {

    public static void main(String[] args) {
        int[] numeros = {10, 4, 24, 3, 8, 12};  // Arreglo de números a ordenar

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);  // Imprimir el arreglo antes de ordenarlo

        // Llamamos al método de ordenamiento
        ordenamientoBurbuja(numeros);

        // Imprimimos el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);  // Imprimir el arreglo después de ordenarlo
    }

    // Método para imprimir el arreglo de forma legible
    public static void imprimirArreglo(int[] numeros) {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();  // Salto de línea
    }

    // Método de ordenamiento Burbuja
    public static void ordenamientoBurbuja(int[] numeros) {
        int n = numeros.length;  // Longitud del arreglo

        // Ciclo exterior: cada vez que se recorre el arreglo, el elemento más grande se "burbujea" al final
        for (int i = 0; i < n - 1; i++) {

            System.out.println("Iteración " + (i + 1) + ":");

            // Ciclo interior: compara elementos adyacentes y los intercambia si están fuera de orden
            for (int j = 0; j < n - i - 1; j++) {  
                // Compara si el elemento actual es mayor que el siguiente
                if (numeros[j] > numeros[j + 1]) {
                    System.out.println("  Intercambiando: " + numeros[j] + " y " + numeros[j + 1]);

                    // Intercambio de los elementos
                    int temp = numeros[j];  // Guardamos temporalmente el valor de numeros[j]
                    numeros[j] = numeros[j + 1];  // Asignamos numeros[j + 1] a numeros[j]
                    numeros[j + 1] = temp;  // Asignamos el valor guardado a numeros[j + 1]

                    // Mostramos el arreglo después del intercambio
                    System.out.print("  Estado del arreglo: ");
                    imprimirArreglo(numeros);
                }
            }
            // Después de cada iteración, mostramos cómo está el arreglo
            System.out.print("  Estado del arreglo al final de la iteración " + (i + 1) + ": ");
            imprimirArreglo(numeros);
        }
    }
}
