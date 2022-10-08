package br.com.fiap.grupob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupob.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
}
