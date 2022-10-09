package br.com.fiap.grupob.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.fiap.grupob.controllers.ProdutoController;
import br.com.fiap.grupob.models.Produto;

@SpringBootTest
public class ProdutoControllerTests {

	@Autowired
	private ProdutoController produtoController;
	
	@Test
	public void deveRetornarEmpresas () {
		List<Produto> produtos = produtoController.listar();
		assertNotNull(produtos);
		assertTrue(produtos.size() > 0);
	}
}
