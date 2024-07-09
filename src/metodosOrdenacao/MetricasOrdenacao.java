package metodosOrdenacao;

public class MetricasOrdenacao {
	private long time;
	private long comparacoes;
	private long trocas;
	
	public MetricasOrdenacao(long time, long comparacoes, long trocas) {
		this.time = time;
		this.comparacoes = comparacoes;
		this.trocas = trocas;
	}

	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getComparacoes() {
		return comparacoes;
	}
	public void setComparacoes(long comparacoes) {
		this.comparacoes = comparacoes;
	}
	public long getTrocas() {
		return trocas;
	}
	public void setTrocas(long trocas) {
		this.trocas = trocas;
	}	
}
