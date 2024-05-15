package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	//PROBLEMA
//	public BigDecimal calcular(Orcamento orcamento) {
//		if (orcamento.getQuantidadeItens() > 5) {
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//		}
//		
//		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
//			return orcamento.getValor().multiply(new BigDecimal("0.05"));
//		}
//		
//		return BigDecimal.ZERO;
//	}
	
	//SOLUCAO (CHAIN ON RESPONSIBILITY)
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDeDescontos = new DescontoParaMaisDeCincoItens(
								new DescontoParaValorMaiorQueQuinhentos(
									new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
