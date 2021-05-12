package modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.21);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		return precioProducto + (precioProducto * 0.15);
	}
}