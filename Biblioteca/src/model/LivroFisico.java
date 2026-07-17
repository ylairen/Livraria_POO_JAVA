package model;

import repository.Promocional;

/*
 * Regras próprias de um Livro Físico
a) Deixamos os comportamentos específicos de um Ebook bem encapsulados
em sua classe, mas repare que há um problema em nossa herança. Em que
lugar devemos colocar os atributos e métodos que fazem sentido apenas
para um livro físico? Por exemplo, o atributo tipo de capa (como brochura,
capa dura, etc.) e o método para calcular o custo de envio do livro físico? Se
adicionarmos esse atributo e método na classe Livro, o Ebook herdará esses
comportamentos que não deveriam existir em seu tipo.

Portanto, devemos separar os tipos de livros, mantendo a classe Livro o
mais genérica possível, com atributos e métodos comuns aos tipos de
livros, enquanto os comportamentos específicos ficam nas classes filhas,
como LivroFisico e Ebook. Em resumo, devemos criar uma nova classe para
cada tipo de livro, pois isso permite que cada uma tenha suas regras
específicas bem encapsuladas, evitando que uma única classe carregue
todas as responsabilidades. Isso resulta em um código mais organizado e
fácil de manter.
 * */

/*
 * ) Portanto, crie uma classe chamada LivroFisico que herda as características
da classe Livro. E adicione:
Atributo
• Tipo de capa //brochura, capa dura, etc.
Métodos
• Seus respectivos getters e setters;
• Construtores;
• mostrarDetalhes();
• calcularCustoEnvio() // o custo de envio é proporcional ao número de
páginas (R$ 0,08 centavos por páginas).

Obs: não é necessário sobrescrever o método aplicaDescontoDe(),
pois o limite de 30% de desconto para o livro físico permanece
inalterado.
 * */

public class LivroFisico extends Livro implements Promocional {

	private String tipoDeCapa;

	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public LivroFisico(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super(nome, descrição, valor, numeroDePaginas, isbn, autor);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDeCapa() {
		return tipoDeCapa;
	}

	public void setTipoDeCapa(String tipoDeCapa) {
		this.tipoDeCapa = tipoDeCapa;
	}

	public float calcularCustoEnvio() {
		//como já tem o número de paginas
		//não preciso passar o parametro
		return getNumeroDePaginas() * 0.08f;
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("===================LIVRO FISICO===================");
		super.mostrarDetalhes();
		System.out.println("Tipo de capa:" + this.tipoDeCapa);
	}
	
	/*
	 * i) Adicione o método aplicaDesconteDe() na classe LivroFisico para permitir
	 * até 30% de desconto.
	 */

	/*
	@Override
	public boolean aplicaDescontoDe(double desconto) {
		if (desconto <= 30) {
			aplicarDesconto(desconto);
			return true;
		}
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
		if (percentual <= 30) {
			aplicarDesconto(percentual);
			return true;
		}
		return false;
	}
	
	

}
