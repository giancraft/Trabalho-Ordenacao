package metodosOrdenacao;

public class BubbleSort {
	public static MetricasOrdenacao bubbleSort(long[] array) {
		long comp = 0;
		long trocas = 0;
		long tempoInicio = System.nanoTime();
		
		long temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
<<<<<<< HEAD
                comp++;
=======
                comp++; // Comparações Realizadas
>>>>>>> origin/main
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
<<<<<<< HEAD
                    trocas++;
=======
                    trocas++; // Trocas Realizadas
>>>>>>> origin/main
                }
            }
        }
        
        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicio) / 1000000;
        return new MetricasOrdenacao(duracao, comp, trocas);
	}
}
