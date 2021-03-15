package br.com.kemoel.gerenciadorEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kemoel.gerenciadorEventos.model.Evento;
@Repository
public interface EventoRepository extends JpaRepository<Evento, String> {
	Evento findById(Long id);
}
