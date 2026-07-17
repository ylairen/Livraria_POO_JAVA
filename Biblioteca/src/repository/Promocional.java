package repository;

/*
 * a) Como podemos resolver o problema do método aplicaDescontoDe() estar
disponível para todas as classes, inclusive no MiniLivro?
Uma forma simples e eficaz de resolver esse problema é criar uma nova
interface chamada Promocional, que contenha o método abstrato
aplicaDescontoDe(). Dessa forma, apenas as classes que realmente podem
oferecer descontos deverão implementar essa interface, garantindo que o
método esteja disponível apenas onde for apropriado.

b) Portanto, crie a interface Promocional, contendo o método abstrato
aplicaDescontoDe(). Em seguida, remova esse método da classe Livro, pois
não é mais necessário nela, apenas as subclasses que oferecem desconto
devem implementar este método.
 * */

/*
 * Novas regras da interface no Java
a) Desde o Java 8, uma interface pode ter métodos concretos. Com isso, suas
implementações não são obrigadas a reescrevê-los. Um dos novos recursos
é conhecido como default method.
b) Basta adicionar a palavra reservada default no início da declaração de um
método de interface para que ele possa ter um código implementado. Por
exemplo, crie um método chamado aplicaDescontoDe10Porcento() na
interface Promocional. Como não pode ter instâncias de atributos, basta
chamar o aplicaDescontoDe() dentro do método, para que chame a
implementação padrão da classe a qual pertence.

default boolean aplicaDescontoDe10Porcento() {
return aplicaDescontoDe(0.10);
}
Métodos defaults foram adicionados para permitir que interfaces evoluam
sem quebrar código existente. Como na interface Promocional foi
implementado o aplicaDescontoDe10Porcento(), qualquer classe que
implemente esta interface, herdará o método já implementado, sem a
necessidade de implementar o método aplicaDescontoDe10Porcento()
 * */

public interface Promocional {

	//Só é nescessario chamar o AplicaDescontoDe
	//toda classe que implementa a interface promocional e implementa
	//esse metodo
	public abstract boolean aplicaDescontoDe(double percentual);
	//automaticamente tem acesso ao metodo default
	
	//todas as classes que implementam a interface
	//recebem automaticamente o aplicaDescontoDe10Porcento
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.10);
	}
	
}
