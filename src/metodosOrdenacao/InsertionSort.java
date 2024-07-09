package metodosOrdenacao;

public class InsertionSort {
	public static MetricasOrdenacao insertionSort(long[] array) {
		long comp = 0;
        long trocas = 0;
        long tempoInicio = System.nanoTime();
        
        long pivo; 
        int j;
        for (int i = 1; i < array.length; i++) {
            pivo = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > pivo) {
                comp++; // Comparações Realizadas
                array[j + 1] = array[j];
                j = j - 1;
                trocas++; // Trocas Realizadas
            }
            array[j + 1] = pivo;
        }
        
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, comp, trocas);
	}
}
