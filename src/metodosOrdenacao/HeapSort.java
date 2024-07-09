package metodosOrdenacao;

public class HeapSort {
	public static MetricasOrdenacao heapSort(long[] array) {
        long comp = 0;
        long trocas = 0;
        long tempoInicio = System.nanoTime();
        
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            long[] heapifyResult = heapify(array, n, i, comp, trocas);
            comp = heapifyResult[0];
            trocas = heapifyResult[1];
        }

        for (int i = n - 1; i > 0; i--) {
            long temp = array[0];
            array[0] = array[i];
            array[i] = temp;
<<<<<<< HEAD
            trocas++;
=======
            trocas++; // Aqui Também são Realizadas Trocas 
>>>>>>> origin/main
            long[] heapifyResult = heapify(array, i, 0, comp, trocas);
            comp = heapifyResult[0];
            trocas = heapifyResult[1];
        }
        
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, comp, trocas);
    }

    private static long[] heapify(long[] array, int n, int i, long comp, long trocas) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

<<<<<<< HEAD
        comp++;
=======
        comp++; // Comparações Realizadas
        
>>>>>>> origin/main
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

<<<<<<< HEAD
        comp++;
=======
        comp++; // Aqui Também são Realizadas Comparações
        
>>>>>>> origin/main
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            long swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
<<<<<<< HEAD
            trocas++;
=======
            trocas++; // Trocas Realizadas
>>>>>>> origin/main
            long[] heapifyResult = heapify(array, n, largest, comp, trocas);
            comp = heapifyResult[0];
            trocas = heapifyResult[1];
        }

        return new long[]{comp, trocas};
    }
}
