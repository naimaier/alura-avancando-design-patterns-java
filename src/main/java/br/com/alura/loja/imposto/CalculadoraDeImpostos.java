package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	//PROBLEMA
//	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
//		
//		switch(tipoImposto) {
//		case ICMS:
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//		case ISS:
//			return orcamento.getValor().multiply(new BigDecimal("0.06"));
//		default:
//			return BigDecimal.ZERO;
//		}
//	}
	
	//SOLUCAO (STRATEGY)
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento); 
	}
}
