package br.gov.sp.fatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class Outfit implements QuantoCusta{

	private List<PecaRoupa> roupas;
	private String ocasiao;
	private Integer pecas;
	private String nome; 
	
	public Outfit() {
		super();
		roupas = new ArrayList<>();
	}

	public List<PecaRoupa> getRoupas() {
		return roupas;
	}

	public void setRoupas(List<PecaRoupa> roupas) {
		this.roupas = roupas;
	}

	public String getOcasiao() {
		return ocasiao;
	}

	public void setOcasiao(String ocasiao) {
		this.ocasiao = ocasiao;
	}


	public Integer getPecas() {
		return pecas;
	}

	public void setPecas(Integer pecas) {
		this.pecas = pecas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Double quantoCusta() {
		Double total = 0.00;
		
		for(PecaRoupa peca : this.roupas) {
			total = total + peca.getPreco();
		}
		
		return total;
	}

}
