package model;

//Dica geral: use Ctrl + Shift + F 

//É UMA CLASSE BASE

/*
 * 1. Qual o tipo de cada livro?
a) Além de Ebook, também temos um LivroFisico, que já provou ser um objeto
diferente por ter comportamentos diferentes. Mas afinal, o que é um Livro
agora? Um Ebook ou um LivroFisico?
Durante o curso de programação orientada a objetos, vamos criar e evoluir a
aplicação Java de uma Livraria. Esse contexto vai nos possibilitar colocar em prática
todos os principais recursos e conceitos da linguagem Java e orientação a objetos.
Na verdade, nenhum dos dois. Um Livro é apenas uma abstração de tudo
que os diferentes tipos de livro devem ter (herdar) em nossa livraria.
 * */

/*
 * b) Ao fazer uma venda, queremos saber ao certo o tipo de livro que está sendo
vendido, não devemos permitir a venda de um Livro, mas sim de suas
subclasses. Há uma forma bem simples de impedir que a classe Livro seja
instanciada: podemos simplesmente adicionar em sua declaração o
modificador abstract.
public abstract class Livro {
}
 * */

/*c) Todo livro criado agora precisa ter seu tipo bem definido, portanto
precisaremos mudar todas as partes de nosso código que criava um Livro
para usar uma de suas classes filhas. Por enquanto, mude a classe
CadastroDeLivros, AplicarDescontoLivro e ComparandoReferencias.*/

//A Classe livro virou uma classe base então não precisamos instanciala
//só ultilizamos para herdar metodos e atributos

public abstract class Livro implements Produto{

	private String nome;
	private String descrição;
	private double valor;// valor private
	private int numeroDePaginas;
	private String isbn;

//Ela apenas declara uma variável capaz de guardar a
//referência de um objeto Autor
	public Autor autor;

	// o autor=null até o momento que é criado

	/*
	 * a) Adicione a regra de negócio de que todo Livro precisa ter um Autor no
	 * momento da criação/instanciação de um objeto Livro. Para isso, use o método
	 * construtor, obrigando a passagem do Autor no momento da criação do objeto.
	 * 
	 */

	/*
	 * public Livro() {
	 * 
	 * System.out.println("Livro criado"); }
	 */

	// regra de negocio

	public Livro(Autor autor) {
		this.autor = autor;
		System.out.println("Livro criado");
	}

	// SOBRECARGA DE CONSTRUTOR
	/*
	 * Para oferecer mais flexibilidade na criação de livros, podemos utilizar
	 * sobrecarga de construtores (overloading). Dessa forma, será possível
	 * criar/instanciar um livro de duas maneiras: passando apenas o autor ou
	 * informando o autor junto com todos os outros atributos do livro. Isso permite
	 * maior controle sobre o cadastro dos livros, garantindo que sempre haja um
	 * autor associado, mas permitindo também que outros detalhes sejam definidos.
	 * Para que isso funcione, adicione na classe Livro um novo construtor que
	 * recebe todos os atributos.
	 * 
	 * 
	 */

	public Livro(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super();
		this.nome = nome;
		this.descrição = descrição;
		this.valor = valor;
		this.numeroDePaginas = numeroDePaginas;
		this.autor = autor;

		/*
		 * Em nosso CadastroDeLivros, sempre que criamos um Livro, já atribuímos seu
		 * número de ISBN, mas normalmente esse identificador pode demorar alguns dias
		 * para ficar pronto. Inicialize esse atributo da classe de Livro no construtor
		 * que passa apenas o autor, para que não fique o valor default (null) na
		 * String. • this.isbn = "000-00-0000-00-0"; • Valor default para cada tipo de
		 * primitiva:
		 * 
		 */
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

	// metodo para verificar se tem autor

	/*
	 * Observe que, com a introdução da regra de negócio que obriga ter um Autor no
	 * momento da criação do Livro, o método temAutor(), criado e utilizado dentro
	 * de mostrarDetalhes() da classe Livro, deixa de ser necessário, já que sempre
	 * haverá um Autor associado ao Livro. Assim, a evolução do código não significa
	 * apenas adicionar novas funcionalidades, mas também refinar e melhorar sua
	 * estrutura, tornando-o mais legível e fácil de manter. Dessa forma, refatore o
	 * código, removendo a redundância (o método temAutor()) para torná-lo mais
	 * eficiente.
	 * 
	 */
	/*
	 * public boolean temAutor() {
	 * 
	 * if (autor != null) { System.out.println("Tem autor");
	 * autor.mostrarDetalhes(); return true; } return false;
	 * 
	 * }
	 */

	// O ideal é que ele não imprima nada
	// ele calcula o desconto e o aplica desconto de faz a chamada
	public double aplicarDesconto(double desconto) {
		double cal = (this.valor * desconto) / 100;
		double Total = this.valor - cal;
		this.valor = Total;
		return Total;
	}

	/*
	 * a) Limitando desconto do Livro: adicione ao método aplicaDescontoDe() da
	 * classe Livro a regra de negócio em que um livro pode ter no máximo 30% de
	 * desconto. Retorne um boolean para indicar se o desconto foi aplicado ou não.
	 */

	/*
	 * c) Verifique que há um grave problema! É possível aplicar um desconto de 40%
	 * ou mais, sem usar o método aplicaDescontoDe(). Nada obriga o desenvolvedor a
	 * utilizar o método aplicaDescontoDe(). livro.valor = livro.valor -
	 * (livro.valor * 0.4);
	 */

	/*
	 * d) Para restringir o acesso para o atributo valor, basta modificar a
	 * visibilidade do atributo para private, que até então é default (padrão). Ao
	 * restringir o acesso apenas a própria classe Livro pode acessar. Modifique a
	 * visibilidade do atributo valor para private. Perceba que todos os lugares que
	 * acessavam esse atributo passaram a não compilar, já que apenas a própria
	 * classe pode fazer isso.
	 */

	/*
	 * h) Uma solução para esse problema é tornar o método aplicaDescontoDe() da
	 * classe Livro abstrato. Isso garante que todas as subclasses sejam obrigadas a
	 * sobrescrevê-lo, definindo explicitamente suas próprias regras de desconto
	 * para evitar omissões. Portanto, transforme o método aplicaDescontoDe() em um
	 * método abstrato. • public abstract boolean aplicaDescontoDe(double
	 * porcentagem);
	 */

	// esse metodo apenas verifica a condição e chama
	// o metodo que calcula
	
	//como o minilivro não permite aplicar desconto
	//não faz sentido que ele possa ser ultilizado 
	//atraves da herança
	
	//public abstract boolean aplicaDescontoDe(double desconto);
	
		/*
		 * Aqui ele não salva o valor if (desconto <= 30) { aplicarDesconto(desconto);
		 * return true; } System.out.println(false); return false;
		 */

		/*if (desconto <= 30) {
			// aqui o objeto é auterado e passa a valer o valor com desconto
			this.valor = aplicarDesconto(desconto);
			return true;
		}
		return false;
	}
*/
	/*
	 * 
	 * */

}
