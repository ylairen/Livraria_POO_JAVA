package model;

import repository.Promocional;

public class Ebook extends Livro implements Promocional {
	
	private String formato;
	private int tamanhoEmMB;

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
