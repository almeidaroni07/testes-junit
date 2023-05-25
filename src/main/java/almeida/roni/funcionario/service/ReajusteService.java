package almeida.roni.funcionario.service;

import java.math.BigDecimal;

import almeida.roni.funcionario.model.Desempenho;
import almeida.roni.funcionario.model.Funcionario;

public class ReajusteService {

	public static void calcularReajuste(Funcionario funcionario, Desempenho desenpenho) {
		BigDecimal reajuste = funcionario.getSalario().multiply(desenpenho.percentualReajuste());
		funcionario.reajusteSalario(reajuste);
	}

}
