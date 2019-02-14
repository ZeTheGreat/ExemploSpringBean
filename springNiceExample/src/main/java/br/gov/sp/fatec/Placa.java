/**
 * 
 */
package br.gov.sp.fatec;

/**
 * @author Emanuel
 *
 */
public class Placa {
	
	/**
	 * Mensagem a ser exibida na placa
	 */
	private Mensagem mensagem;
	
	/**
	 * Construtor
	 */
	public Placa() {
	}
	
	/**
	 * Retorna o texto da placa
	 * @return Texto da placa
	 */
	public String ler() {
		return "[ <" + mensagem.getMensagem() + "> ]";
	}
	
	/**
	 * Setter para mensagem
	 * @param mensagem
	 */
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

}
