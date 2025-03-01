public class Main {

    public static void main(String[] args) {
        int[] numeros = {10, 4, 24, 3, 8, 12};

        // Llamamos al método de ordenamiento
        ordenamientoBurbuja(numeros);

        // Imprimimos el array ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

//    Método de ordenamiento Burbuja
    public static void ordenamientoBurbuja(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {  // Corrección aquí
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
}
