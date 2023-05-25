package almeida.roni.funcionario.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import almeida.roni.funcionario.model.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {
		assertThrows(IllegalArgumentException.class, 
					 () -> BonusService.calcularBonus(new Funcionario("Roni Almeida", LocalDate.now(), new BigDecimal("25000"))));
	}
	
	@Test
	void bonusDeveriaSerDeisPorCentoDoSalario() {
		BigDecimal bonus = BonusService.calcularBonus(new Funcionario("Roni Almeida", LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDeisPorCentoParaSalarioExatamenteDe10Mil() {
		BigDecimal bonus = BonusService.calcularBonus(new Funcionario("Roni Almeida", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
