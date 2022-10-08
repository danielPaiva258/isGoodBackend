package br.com.fiap.grupob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupob.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
