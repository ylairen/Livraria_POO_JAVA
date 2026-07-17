package model;

public class MiniLivro extends Livro {

	public MiniLivro(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public MiniLivro(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super(nome, descrição, valor, numeroDePaginas, isbn, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}

}
