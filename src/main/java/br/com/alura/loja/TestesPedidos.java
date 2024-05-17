package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeDeItens = Integer.parseInt(args[2]);
		
		// PROBLEMA
//		Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeDeItens);
//		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
//		
//		System.out.println("Salvar pedido no db");
//		System.out.println("Enviar email com dados do novo pedido");
		
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
		//gerador.executa();
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedido()));
		handler.executa(gerador);
	}
}
