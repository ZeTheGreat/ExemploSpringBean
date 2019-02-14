package br.gov.sp.fatec;

public class PecaRoupa {
	private String tipo;
	private String marca;
	private String tamanho;
	private Double preco;
	
	public PecaRoupa(String tipo, String marca, String tamanho, Double preco) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public PecaRoupa() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
}
