package br.com.gerenciaEventos.eventos.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciaEventos.eventos.entidades.Pessoa;

@Repository 
public interface PessoaRepository 
		extends CrudRepository<Pessoa, Long>{
}
