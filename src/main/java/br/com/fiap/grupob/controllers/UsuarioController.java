package br.com.fiap.grupob.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.grupob.models.Usuario;
import br.com.fiap.grupob.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	public List<Usuario> listar () {
		List<Usuario> listUsuarios = usuarioRepository.findAll();
		return listUsuarios;
	}
	
	@GetMapping("/{id}")
	public Usuario getById (@PathVariable("id") Integer id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario.get();
	}
}
