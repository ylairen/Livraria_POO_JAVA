package model;

import repository.Promocional;

/*a) Como podemos diferenciar um Livro impresso de um Ebook? Cria um
atributo boolean chamado impresso na classe Livro? Mas como fica o
desconto de no máximo 15% para o ebook? E as características específica do
livro, como formato (PDF, ePub, etc)? Se Ebook possui comportamentos e
atributos específicos, ele deve ser representado como um Objeto*/

/*
 * b) Crie uma classe Ebook definindo os atributos e comportamentos específicos
desse novo tipo.
Mas antes, perceba que há muito código repetido aqui: temos a maioria
dos atributos e métodos já escritos na classe Livro.
Atributos
• Nome;
• Descrição;
• Valor;
• ISBN;
• Autor;
• Número de páginas;
• Formato //por exemplo, PDF, ePub, etc;
• Tamanho em MB.
Métodos
• aplicaDescontoDe();
• mostrarDetalhes();
• Getters e Setters dos atributos.
 * */

/*
 * c) Para evitar toda essa repetição de código, podemos ensinar ao compilador
que o Ebook é um tipo de Livro (herança), usando o extends. Portanto, faça
com que a classe Ebook seja uma subclasse da classe Livro. Além disso,
adicione os atributos específicos e seus respectivos getters e setters.
public class Ebook extends Livro

 * */
//APLICANDO HERANÇA
public class Ebook extends Livro implements Promocional {
	
	private String formato;
	private int tamanhoEmMB;

	/*
	 * d) A classe Livro tem construtores obrigando a passagem de um Autor como
	 * parâmetro. Portanto, ao herdar de um Livro, a classe Ebook pode forçar essa
	 * responsabilidade que já está bem definida. Delegue os construtores (um que
	 * passa só o Autor e outro que passa todos os atributos) na classe Ebook, para
	 * isso use o super(); dentro dos construtores.
	 */

	public Ebook(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public Ebook(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super(nome, descrição, valor, numeroDePaginas, isbn, autor);
		// TODO Auto-generated constructor stub
	}


	public Ebook(Autor autor, String formato, int tamanhoEmMB) {
		super(autor);
		this.formato = formato;
		this.tamanhoEmMB = tamanhoEmMB;
	}

	/*
	 * 2. Reescrevendo métodos da superclasse (sobrescrita - override) 
	 * 
	 * a) Agora que a representação de um Ebook está bem definida, implemente a regra de negócio
	 * que limita o desconto máximo a 15%. 
	 * 
	 * • Portanto, no lugar de a classe Ebook
	 * herdar o comportamento do método aplicaDescontoDe() de Livro (limitado a 30%
	 * de desconto), podemos reescrevê-lo. O compilador busca primeiro sua
	 * implementação na classe do objeto instanciado e, caso não a encontre, procura
	 * na superclasse.
	 */

	/*
	 * Para acessar os atributos que são privados da classe Livro (neste caso, o
	 * atributo valor), pode-se alterar sua visibilidade para protected. Mas essa
	 * prática não é recomendada, pois permite que classes do mesmo pacote acessem
	 * os atributos, comprometendo o encapsulamento e possibilitando acessos
	 * indevidos. Em vez disso, utilize os métodos getValor() e setValor(). 
	 * 
	 * • Outra forma de fazer é evitar a repetição lógica. Para isso, use o “super” para
	 * chamar o método da superclasse e, posteriormente, faça as modificações
	 * necessárias.
	 * 
	 * b) Agora reescreva o método mostrarDetalhes() na classe Ebook,
	 * para que mostre também os atributos adicionados nesta subclasse.
	 * 
	 */
	
	
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getTamanhoEmMB() {
		return tamanhoEmMB;
	}

	public void setTamanhoEmMB(int tamanhoEmMB) {
		this.tamanhoEmMB = tamanhoEmMB;
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("===================EBOOK=========================");
		super.mostrarDetalhes();
		System.out.println("Formato:"+this.formato);
		System.out.println("Tamanho em MB:"+this.tamanhoEmMB);
		System.out.println("=================================================");
	}


	@Override
	public double aplicarDesconto(double desconto) {
		return super.aplicarDesconto(desconto);
	}

	//o livro permite desconto de até 30%
	//o ebook permite desconto de até 15%
	
	/*
	@Override
	public boolean aplicaDescontoDe(double desconto) {
		if(desconto <= 15) {
			this.setValor(aplicarDesconto(desconto));
			return true;
		}
		System.out.println("Não foi possivel aplicar o desconto");
		return false;
	}
	*/

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aplicaDescontoDe(double percentual) {
		// TODO Auto-generated method stub
		return false;
	}

}
