package Arrays.SortPro;

import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y
         * 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación
         * llamado "Burbuja", con el objetivo de ordenar el array completamente. Puedes consultar el
         * siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
         */

        int [] nElementos = new int[5];
        inicializarArray(nElementos);
        mostrarArray(nElementos);
        System.out.println("Array sin ordenar");
        ordenacionBurbuja(nElementos);

        System.out.println("Array ordenada");
        mostrarArray(nElementos);

    }

    private static void ordenacionBurbuja(int[] nElementos) {
        int iteracion = 0;

        boolean cambio = true;

        while (cambio) {
            cambio = false;
            iteracion++;
            for (int i = 0; i < nElementos[i]-iteracion; i++) {
                if (nElementos[i] > nElementos[i+1]){
                    cambio = true;
                    //Intercambio de los dos elementos
                    int temp = nElementos[i];
                    nElementos[i] = nElementos[i+1];
                    nElementos[i+1] = temp;
                }
            }
        }
    }

    private static void mostrarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            System.out.print(nElementos[i] + " ");
        }
    }

    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numeroAleatorios(0,1000);
        }
    }

    private static int numeroAleatorios(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
