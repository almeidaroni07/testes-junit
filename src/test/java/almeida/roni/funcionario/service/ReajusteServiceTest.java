package almeida.roni.funcionario.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import almeida.roni.funcionario.model.Desempenho;
import almeida.roni.funcionario.model.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForAhDesejar() {
		
		Funcionario funcionario = new Funcionario("Roni Almieda", LocalDate.now(), new BigDecimal("1000"));
		
		ReajusteService.calcularReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}	
	
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForBom() {
		
		Funcionario funcionario = new Funcionario("Roni Almieda", LocalDate.now(), new BigDecimal("1000"));
		
		ReajusteService.calcularReajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}	
	
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForOtimo() {
		
		Funcionario funcionario = new Funcionario("Roni Almieda", LocalDate.now(), new BigDecimal("1000"));
		
		ReajusteService.calcularReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}	

}
