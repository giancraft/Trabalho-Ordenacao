package metodosOrdenacao;

import java.util.Arrays;
import java.util.Random;

public class TesteOrdenacao {
	public static void testeOrdenacao(long[] array) {
		long[] arrayCopy;

<<<<<<< HEAD
        arrayCopy = Arrays.copyOf(array, array.length);
=======
       /* arrayCopy = Arrays.copyOf(array, array.length);
>>>>>>> origin/main
        MetricasOrdenacao metricas = BubbleSort.bubbleSort(arrayCopy);
        System.out.println("Bubble Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());

        arrayCopy = Arrays.copyOf(array, array.length);
        metricas = SelectionSort.selectionSort(arrayCopy);
        System.out.println("Selection Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());
<<<<<<< HEAD

        arrayCopy = Arrays.copyOf(array, array.length);
        metricas = InsertionSort.insertionSort(arrayCopy);
        System.out.println("Insertion Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());

       /* arrayCopy = Arrays.copyOf(array, array.length);
        metricas = QuickSort.quickSort(arrayCopy, 0, arrayCopy.length - 1);
        System.out.println("Quick Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());*/

        arrayCopy = Arrays.copyOf(array, array.length);
=======
		*/
        arrayCopy = Arrays.copyOf(array, array.length);
        MetricasOrdenacao metricas = InsertionSort.insertionSort(arrayCopy);
        System.out.println("Insertion Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());
        
        /*arrayCopy = Arrays.copyOf(array, array.length);
        MetricasOrdenacao metricas = QuickSort.quickSortMetrica(arrayCopy, 0, arrayCopy.length - 1);
        System.out.println("Quick Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());
		*/
        /*arrayCopy = Arrays.copyOf(array, array.length);
>>>>>>> origin/main
        metricas = MergeSort.mergeSort(arrayCopy, 0, arrayCopy.length - 1);
        System.out.println("Merge Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());

        arrayCopy = Arrays.copyOf(array, array.length);
        metricas = HeapSort.heapSort(arrayCopy);
        System.out.println("Heap Sort - Tempo: " + metricas.getTime() + "ms, Comparações: " + metricas.getComparacoes() + ", Trocas: " + metricas.getTrocas());
<<<<<<< HEAD
=======
		*/
>>>>>>> origin/main
	}
	public static long[] criarVetorOrdenado(int size) {
		long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
	}
	
	public static long[] criarVetorInvertido(int size) {
		long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
	}
	
	public static long[] criarVetorAleatorio(int size) {
        long[] array = new long[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size);
        }
        return array;
	}
}
