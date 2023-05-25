package almeida.roni.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void somarDoisNumerosPositivos() {
		try {
			int soma = Calculadora.somar(2, 2);
			assertEquals(4, soma);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void subtrairDoisNumerosPositivos() {
		try {
			int subtracao = Calculadora.subtrair(2, 1);
			assertEquals(1, subtracao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void multplicarDoisNumerosPositivos() {
		try {
			int multiplicacao = Calculadora.multiplicar(2, 5);
			assertEquals(10, multiplicacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void dividirDoisNumerosPositivos() {
		try {
			int divisao = Calculadora.dividir(10, 2);
			assertEquals(5, divisao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
