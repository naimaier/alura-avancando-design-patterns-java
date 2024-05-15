package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeDeItens;

	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	// Substituido pelo command handler
//	public void executa() {
//		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeDeItens);
//		
//		Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
//		
//		System.out.println("Salvar pedido no db");
//		System.out.println("Enviar email com dados do novo pedido");
//	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	
}
