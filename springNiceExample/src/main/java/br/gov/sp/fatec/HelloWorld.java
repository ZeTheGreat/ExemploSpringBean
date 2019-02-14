/**
 * 
 */
package br.gov.sp.fatec;

/**
 * @author Emanuel
 *
 */
public class HelloWorld implements Mensagem {
	
	/**
	 * Um nome
	 */
	private String nome;
	
	/**
	 * Construtor
	 */
	public HelloWorld() {
	}
	
	/**
	 * Setter do atributo nome
	 * @param nome Um nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getMensagem() {
		return "Hello World! Hello " + nome + "!";
	}

}
