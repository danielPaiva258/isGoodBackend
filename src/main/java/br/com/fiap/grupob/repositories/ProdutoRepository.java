package br.com.fiap.grupob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupob.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
