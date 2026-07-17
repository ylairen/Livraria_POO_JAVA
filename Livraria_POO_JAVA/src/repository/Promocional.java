package repository;

public interface Promocional {

	public abstract boolean aplicaDescontoDe(double percentual);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.10);
	}
	
}
