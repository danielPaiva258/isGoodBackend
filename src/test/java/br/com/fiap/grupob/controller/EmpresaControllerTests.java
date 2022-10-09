package br.com.fiap.grupob.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.fiap.grupob.controllers.EmpresaController;
import br.com.fiap.grupob.models.Empresa;

@SpringBootTest
public class EmpresaControllerTests {
	
	@Autowired
	private EmpresaController empresaController;

	@Test
	public void deveRetornarEmpresas () {
		List<Empresa> empresas = empresaController.listar();
		assertNotNull(empresas);
		assertTrue(empresas.size() > 0);
	}
}
