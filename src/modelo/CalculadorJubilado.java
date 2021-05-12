package modelo;

public class CalculadorJubilado extends Calculador {
	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.1);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		return precioProducto;
	}
}