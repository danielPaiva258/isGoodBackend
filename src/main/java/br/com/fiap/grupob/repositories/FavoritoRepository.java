package br.com.fiap.grupob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupob.models.Favorito;

public interface FavoritoRepository extends JpaRepository<Favorito, Integer>{

}
