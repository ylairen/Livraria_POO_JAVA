package model;

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
