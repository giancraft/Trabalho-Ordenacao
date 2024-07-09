package metodosOrdenacao;

public class SelectionSort {
	public static MetricasOrdenacao selectionSort(long[] array) {
		long comp = 0;
        long trocas = 0;
        long tempoInicio = System.nanoTime();
        
        int min; 
        long aux;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                comp++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
            trocas++;
        }
        
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, comp, trocas);
	}
}
