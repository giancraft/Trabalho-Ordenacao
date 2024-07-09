package metodosOrdenacao;

public class QuickSort {
<<<<<<< HEAD
	public static MetricasOrdenacao quickSort(long[] array, int left, int right) {
        long tempoInicio = System.nanoTime();
        long[] metricas = quickSortHelper(array, left, right, 0, 0);
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, metricas[0], metricas[1]);
    }

    private static long[] quickSortHelper(long[] array, int left, int right, long comp, long trocas) {
        if (left < right) {
            int[] partitionResult = partition(array, left, right, comp, trocas);
            int pivotIndex = partitionResult[0];
            comp = partitionResult[1];
            trocas = partitionResult[2];
            long[] leftResult = quickSortHelper(array, left, pivotIndex - 1, comp, trocas);
            long[] rightResult = quickSortHelper(array, pivotIndex + 1, right, leftResult[1], leftResult[2]);
            comp = rightResult[1];
            trocas = rightResult[2];
        }
        return new long[]{0, comp, trocas};
    }

    private static int[] partition(long[] array, int left, int right, long comp, long trocas) {
        long pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            comp++;
            if (array[j] < pivot) {
                i++;
                long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                trocas++;
            }
        }
        long temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        trocas++;
        return new int[]{i + 1, (int) comp, (int) trocas};
    }
=======
	public static MetricasOrdenacao quickSortMetrica(long[] array, int left, int right) {
	    long tempoInicio = System.nanoTime();
	    long[] metrics = {0, 0}; // Inicializa métricas de comparações e trocas
	    quickSort(array, left, right, metrics);
	    long tempoFinal = System.nanoTime();
	    long duracao = (tempoFinal - tempoInicio) / 1000000;
	    return new MetricasOrdenacao(duracao, metrics[0], metrics[1]);
	}

	private static void quickSort(long[] array, int left, int right, long[] metrics) {
	    if (left < right) {
	        int p = partition(array, left, right, metrics);
	        quickSort(array, left, p, metrics);
	        quickSort(array, p + 1, right, metrics);
	    }
	}
   
   private static int partition(long[] array, int left, int right, long[] metrics) {
	   	int meio = (left + right) / 2;
	    long pivot = array[meio];
	    int i = left - 1;
	    int j = right + 1;
	    while (true) {
	        do {
	            i++;
	            metrics[0]++; // Comparações Realizadas
	        } while (array[i] < pivot);

	        do {
	            j--;
	            metrics[0]++; // Aqui Também são Realizadas Comparação
	        } while (array[j] > pivot);

	        if (i >= j) {
	            return j;
	        }

	        long aux = array[i];
	        array[i] = array[j];
	        array[j] = aux;
	        metrics[1]++; // Trocas Realizadas
	    }
   }
>>>>>>> origin/main
}
