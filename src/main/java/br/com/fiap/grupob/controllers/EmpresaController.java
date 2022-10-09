package br.com.fiap.grupob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.grupob.models.Empresa;
import br.com.fiap.grupob.repositories.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping("/listar")
	public List<Empresa> listar () {
		List<Empresa> listEmpresas = empresaRepository.findAll();
		return listEmpresas;
	}
}
