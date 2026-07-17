package model;
/*
 * c) Agora vamos evoluir a classe CarrinhoDeCompras para que seja possível,
além de Livros, adicionar Revistas. Como?
• Faço herança entre Revista e Livro para usufrui do polimorfismo? Isso
faria com que a revista herdasse características que não fazem
sentido para ela, como ISBN e autor, contrariando as regras de
negócio do cenário.
• Então crio outro método adiciona exclusivo para revista? Isso geraria
repetição de código! Além disso, para cada novo produto
possivelmente precisaríamos criar um novo método, o que tornaria
trabalhosa a evolução da classe CarrinhoDeCompras.
Em Java, há uma outra forma para se tirar proveito de todos os
benefícios do polimorfismo. Podemos criar uma interface chamada
Produto e fazer com que as classes Livro e Revista a implementem.
Assim, ao passar um Produto como parâmetro no método
adiciona(), conseguiremos tirar proveito do polimorfismo. Isso cria
uma abstração comum entre Livro e Revista, permitindo que ambas
as classes sejam tratadas como Produto. Além disso, definiremos na
interface um conjunto de comportamentos, obrigando as classes a
implementarem os métodos abstratos nela definidos. Agora há uma
forma simples e flexível para representar qualquer Produto de nossa
livraria
 * */

/*
 * Portanto, classes que implementam interfaces podem ser tratadas
como objetos do tipo da interface. Isso permite o uso de
polimorfismo, pois uma referência do tipo da interface pode
apontar para instâncias de diferentes classes que a implementam.
Ou seja, é possível tratar diferentes objetos de forma uniforme,
desde que sigam o mesmo contrato definido pela interface.
• Portanto, crie uma interface chamada Produto. Para isso,
simplesmente trocarmos na declaração o nome classe pelo
modificador interface.
public interface Produto {
}
• Além disso, crie os métodos abstratos na interface Produto:
o getValor();
▪ public abstract double getValor();

o getResumo(); //será responsável por exibir um resumo de
cada um dos produtos no carrinho de compras que serão
adquiridos.

▪ public abstract String getResumo();
• Implemente a interface Produto nas classes Livro e Revista. Para fazer
isso, basta adicionar a palavra-chave implementsseguida do nome da
interface que deve ser informada no final da declaração das classes.
 * */

/*
 * d) Ao implementar uma interface, a classe assume o compromisso de fornecer
implementações para todos os métodos abstratos definidos nela. Neste caso,
como as classes já possuem o método getValor(), não é necessário
reimplementá-lo. No entanto, é obrigatório implementar o método
getResumo(). Portanto, realize essa implementação da seguinte forma:
• Implemente o método getResumo() na classe abstrata Livro para
retornar uma String contendo apenas o nome e o autor do livro.
o Na classe LivroFisico, sobrescreva esse método para incluir a
informação "Versão impressa: " antes do nome e autor.
o Na classe Ebook, sobrescreva o método para incluir a
informação "Ebook: " antes do nome e autor.
o Na classe MiniLivro, sobrescreva o método para incluir a
informação "MiniLivro: " antes do nome e autor.
• Na classe Revista, implemente o getResumo() retornando uma String
que informe que se trata de uma revista, incluindo o nome da revista
e o nome fantasia da editora.
e) Como todas as classes que implementam uma interface podem ser
referenciadas por este tipo, podemos usar polimorfismo com interfaces.
Portanto, no método adiciona do CarrinhoDeCompras podemos receber um
Produto como parâmetro. Também remova o método aplicaDescontoDe(),
pois o sistema deixou de aplicar automaticamente o desconto no
CarrinhoDeCompras.
 * */

/*
 * c) Portanto, implemente a interface Produto nas classes que oferecem
desconto:
• LivroFisico;
• Ebook;
• Revista.
Ao implementar uma interface, a classe se compromete a implementar
seus métodos. Neste caso, como o método aplicaDescontoDe() já existe
nas classes, não é preciso reimplementá-lo
 * */

//como implementam como interface
//a classe pode ser tratada como objeto

public interface Produto {

	public abstract double getValor();

	public abstract String getResumo();

}
