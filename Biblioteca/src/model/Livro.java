package model;

//Dica geral: use Ctrl + Shift + F 

public abstract class Livro implements Produto{

	private String nome;
	private String descrição;
	private double valor;// valor private
	private int numeroDePaginas;
	private String isbn;

	public Autor autor;

	public Livro(Autor autor) {
		this.autor = autor;
		System.out.println("Livro criado");
	}

	public Livro(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super();
		this.nome = nome;
		this.descrição = descrição;
		this.valor = valor;
		this.numeroDePaginas = numeroDePaginas;
		this.isbn = "000-00-0000-00-0";

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double d) {
		this.valor = d;
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

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void mostrarDetalhes() {

		// temAutor();

		System.out.println("=================================================");
		System.out.println("Nome do Livro:" + this.nome);
		System.out.println("Descrição:" + this.descrição);
		System.out.println("Valor:" + this.valor);
		System.out.println("Número de paginas:" + this.numeroDePaginas);
		System.out.println("ISBN:" + this.isbn);
		System.out.println("Nome do Autor:" + autor.getNome());
		System.out.println("Email do Autor:" + autor.getEmail());
		System.out.println("CPF do Autor:" + autor.getCPF());

	}

	public double aplicarDesconto(double desconto) {
		double cal = (this.valor * desconto) / 100;
		double Total = this.valor - cal;
		this.valor = Total;
		return Total;
	}


}
