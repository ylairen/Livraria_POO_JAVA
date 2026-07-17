package model;

/*
* Agora que Livro é abstrato, adicione um novo tipo de Livro em nossa livraria,
o MiniLivro, que representará um livro mais enxuto e com algumas
particularidades (por exemplo, não pode aplicar o desconto, já estará no
preço promocional).
• Portanto, crie a subclasse MiniLivro da superclasse Livro.
• Não esqueça de delegar os construtores.
 * */

public class MiniLivro extends Livro {

	public MiniLivro(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public MiniLivro(String nome, String descrição, float valor, int numeroDePaginas, String isbn, Autor autor) {
		super(nome, descrição, valor, numeroDePaginas, isbn, autor);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Adicione o método aplicaDescontoDe() na classe MiniLivro para não permitir
	 * desconto. Para isso, apenas retorne false. Essa solução não é a mais
	 * eficiente, pois exige que a classe MiniLivro implemente o método
	 * aplicaDescontoDe(), mesmo sem oferecer desconto. No entanto, ela mantém o
	 * polimorfismo e elimina o risco de esquecermos de definir regras de desconto
	 * em novas subclasses de Livro. Agora, sempre que criarmos um novo tipo de
	 * livro, precisaremos estabelecer explicitamente sua política de desconto,
	 * garantindo que o código só compile se essa regra for implementada. • Mais
	 * adiante, exploraremos técnicas mais eficientes para lidar com essa questão!
	 */

	/*
	 * d) Agora podemos remover o método aplicaDescontoDe() da classe MiniLivro. Uma
	 * vez que ele não aplica desconto.
	 */

	/*
	 * @Override public boolean aplicaDescontoDe(double desconto) { return false; }
	 */
	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}

}
