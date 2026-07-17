package model;

//Dica geral: use Ctrl + Shift + F 

public class Autor {

	private String nome;
	private String email;
	private String CPF;

	public Autor() {
		System.out.println("Autor criado");
	}
	
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

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void mostrarDetalhes() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Email:" + this.email);
		System.out.println("CPF:" + this.CPF);

	}

}
