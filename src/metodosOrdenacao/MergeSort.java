package metodosOrdenacao;

public class MergeSort {
	public static MetricasOrdenacao mergeSort(long[] array, int left, int right) {
        long tempoInicio = System.nanoTime();
        long[] metricas = mergeSortHelper(array, left, right, 0, 0);
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, metricas[0], metricas[1]);
    }

    private static long[] mergeSortHelper(long[] array, int left, int right, long comp, long trocas) {
        if (left < right) {
            int mid = (left + right) / 2;
            long[] leftResult = mergeSortHelper(array, left, mid, comp, trocas);
            long[] rightResult = mergeSortHelper(array, mid + 1, right, leftResult[0], leftResult[1]);
            long[] mergeResult = merge(array, left, mid, right, rightResult[0], rightResult[1]);
            comp = mergeResult[0];
            trocas = mergeResult[1];
        }
        return new long[]{comp, trocas};
    }

    private static long[] merge(long[] array, int left, int mid, int right, long comp, long trocas) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        long[] L = new long[n1];
        long[] R = new long[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            comp++;
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
                trocas++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
            trocas++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
            trocas++;
        }

        return new long[]{comp, trocas};
    }
}
