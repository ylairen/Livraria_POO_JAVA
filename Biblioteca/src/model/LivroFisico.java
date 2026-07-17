package model;

import repository.Promocional;

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
	
		return getNumeroDePaginas() * 0.08f;
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("===================LIVRO FISICO===================");
		super.mostrarDetalhes();
		System.out.println("Tipo de capa:" + this.tipoDeCapa);
	}

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
