package almeida.roni.funcionario.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Funcionario {
	
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	
}
