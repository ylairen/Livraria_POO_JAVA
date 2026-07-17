package model;

class Revista implements Produto {

	private String nome ;
    private String descrição;
	private double valor;
	private Editora editora;
	
	public Revista() {
		
	}

	public Revista(String nome, String descrição, double valor, Editora editora) {
		super();
		this.nome = nome;
		this.descrição = descrição;
		this.valor = valor;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public void aplicaDescontoDe(int desconto){
		
	}
	
	public void mostrarDetalhes(){
		
	}

	//DA INTERFACE PRODUTO
	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
