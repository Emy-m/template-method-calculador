package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculoTest {
	@Test
	public void jubiladoSinPromocionTest() {
		CalculadorJubilado calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);
		double resultado = calculador.calcularPrecio(100);

		assertEquals(110, resultado, 0.01);
	}

	@Test
	public void jubiladoConPromocionTest() {
		CalculadorJubilado calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue());
		double resultado = calculador.calcularPrecio(100);

		assertEquals(100, resultado, 0.01);
	}

	@Test
	public void noJubiladoConPromocionTest() {
		CalculadorNoJubilado calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());
		double resultado = calculador.calcularPrecio(100);

		assertEquals(115, resultado, 0.01);
	}

	@Test
	public void noJubiladoSinPromocionTest() {
		CalculadorNoJubilado calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);
		double resultado = calculador.calcularPrecio(100);

		assertEquals(121, resultado, 0.01);
	}
}
