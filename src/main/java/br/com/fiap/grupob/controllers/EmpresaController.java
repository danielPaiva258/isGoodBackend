package br.com.fiap.grupob.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{id}")
	public Empresa getById (@PathVariable("id") Integer id) {
		Optional<Empresa> empresa = empresaRepository.findById(id);
		return empresa.get();
	}
}
