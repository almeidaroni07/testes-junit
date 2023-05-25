package almeida.roni.funcionario.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import almeida.roni.funcionario.model.Desempenho;
import almeida.roni.funcionario.model.Funcionario;

public class ReajusteServiceTest {
	
	private Funcionario funcionario;
	
	@BeforeEach
	public void ini() {
		this.funcionario = new Funcionario("Roni Almieda", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForAhDesejar() {
		
		ReajusteService.calcularReajuste(this.funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), this.funcionario.getSalario());
	}	
	
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForBom() {

		ReajusteService.calcularReajuste(this.funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), this.funcionario.getSalario());
	}	
	
	
	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoODesenpenhoForOtimo() {

		ReajusteService.calcularReajuste(this.funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), this.funcionario.getSalario());
	}	

}
