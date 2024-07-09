package metodosOrdenacao;

public class QuickSort {
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
}
