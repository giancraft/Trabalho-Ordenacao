package metodosOrdenacao;

public class Main {

	public static void main(String[] args) {
		int size = 100000;
		long[] arrayOrdenado = TesteOrdenacao.criarVetorOrdenado(size);
		long[] arrayInvertido = TesteOrdenacao.criarVetorInvertido(size);
		long[] arrayAleatorio = TesteOrdenacao.criarVetorAleatorio(size);
		
		System.out.println("Vetor Ordenado:");
		TesteOrdenacao.testeOrdenacao(arrayOrdenado);
		
		System.out.println("\nVetor Invertido:");
		TesteOrdenacao.testeOrdenacao(arrayInvertido);
		
		System.out.println("\nVetor Aleatorio:");
		TesteOrdenacao.testeOrdenacao(arrayAleatorio);
	}
}
