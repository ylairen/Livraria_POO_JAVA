package model;

/*b) Antes disso, note que a Editora possui informações próprias, como as listadas
abaixo. Portanto, deve ser representada como uma classe separada (objeto).
Crie a classe Editora definindo seus atributos e comportamentos específicos:
Atributos
• Nome fantasia;
• Razão social;
• CNPJ.
Métodos
• mostrarDetalhes();
• Getters e Setters necessários.
Além disso, delegue os construtores (um vazio e outro que passa todos
os atributos).*/

public class Editora {

	private String NomeFantasia;
	private String razãoSocial;
	private String CNPJ;

	public Editora() {

	}

	public Editora(String nomeFantasia, String razãoSocial, String cNPJ) {
		super();
		NomeFantasia = nomeFantasia;
		this.razãoSocial = razãoSocial;
		CNPJ = cNPJ;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}

	public String getRazãoSocial() {
		return razãoSocial;
	}

	public void setRazãoSocial(String razãoSocial) {
		this.razãoSocial = razãoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public void mostrarDetalhes() {

	}

}
