package metodosOrdenacao;

public class Ordenacao {
	public int[] bubbleSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] selectionSort(int array[]) {
		int min, aux;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public int[] insertionSort(int array[]) {
		int pivo, j;
		for (int i = 1; i < array.length; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > pivo) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
	
	public int[] quickSort(int[] array, int left, int right) {
	    if (left < right) {
	        int pivotIndex = partition(array, left, right);
	        quickSort(array, left, pivotIndex - 1);
	        quickSort(array, pivotIndex + 1, right);
	    }
	    return array;
	}

	private int partition(int[] array, int left, int right) {
	    int pivot = array[right];
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (array[j] < pivot) {
	            i++;
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	    int temp = array[i + 1];
	    array[i + 1] = array[right];
	    array[right] = temp;
	    return i + 1;
	}

	public int[] mergeSort(int[] array, int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;
	        mergeSort(array, left, mid);
	        mergeSort(array, mid + 1, right);
	        merge(array, left, mid, right);
	    }
	    return array;
	}

	private void merge(int[] array, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    int[] L = new int[n1];
	    int[] R = new int[n2];
	    
	    for (int i = 0; i < n1; i++)
	        L[i] = array[left + i];
	    for (int j = 0; j < n2; j++)
	        R[j] = array[mid + 1 + j];

	    int i = 0, j = 0, k = left;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            array[k] = L[i];
	            i++;
	        } else {
	            array[k] = R[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        array[k] = L[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        array[k] = R[j];
	        j++;
	        k++;
	    }
	}
	
	public int[] heapSort(int[] array) {
	    int n = array.length;

	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(array, n, i);
	    }

	    for (int i = n - 1; i > 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;

	        heapify(array, i, 0);
	    }
	    return array;
	}

	private void heapify(int[] array, int n, int i) {
	    int largest = i;
	    int left = 2 * i + 1;
	    int right = 2 * i + 2;

	    if (left < n && array[left] > array[largest]) {
	        largest = left;
	    }

	    if (right < n && array[right] > array[largest]) {
	        largest = right;
	    }

	    if (largest != i) {
	        int swap = array[i];
	        array[i] = array[largest];
	        array[largest] = swap;

	        heapify(array, n, largest);
	    }
	}
	
	public boolean verificaOrdem(int array[]) {
		boolean verificador = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					verificador = false;
				}
			}
		}
		return verificador;
	}
	
	public String[] bubbleSortStr(String array[]) {
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareToIgnoreCase(array[j+1]) > 0) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public String[] selectionSortStr(String array[]) {
		int min;
		String aux;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareToIgnoreCase(array[min]) < 0) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public String[] insertionSortStr(String array[]) {
		int j;
		String pivo;
		for (int i = 1; i < array.length; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j].compareToIgnoreCase(pivo) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
	
	public int[] bubbleSortLim(int array[], int k) {
		int temp = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] selectionSortLim(int array[], int k) {
		int min, aux;
		for (int i = 0; i < k - 1; i++) {
			min = i;
			for (int j = i + 1; j < k; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public int[] insertionSortLim(int array[], int k) {
		int pivo, j;
		for (int i = 1; i < k; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > pivo) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
}
