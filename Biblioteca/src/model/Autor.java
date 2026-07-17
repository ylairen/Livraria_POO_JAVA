package model;

//Dica geral: use Ctrl + Shift + F 

public class Autor {

	private String nome;
	private String email;
	private String CPF;

	public Autor() {
		System.out.println("Autor criado");
	}

	/*
	 * Por fim, adicione na classe Autor um novo construtor que receba todos os
	 * atributos para facilitar a criação de objetos de forma mais clara e
	 * eficiente. Fique à vontade para escolher a forma como quer inicializar seus
	 * objetos. Lembrando que, a inicialização de Livro sempre vai exigir um Autor
	 * associado.
	 */
	
	public Autor(String nome, String email, String cPF) {
		super();
		this.nome = nome;
		this.email = email;
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	//NÃO É IDEAL USAR O SETCPF PQ DEPOIS QUE ADICIONADO NÃO PODE SER MODIFICADO

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void mostrarDetalhes() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Email:" + this.email);
		System.out.println("CPF:" + this.CPF);

	}

}
