package br.com.kemoel.gerenciadorEventos.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Etapa {
	@Enumerated(EnumType.STRING)
	private Etapa etapa;
	
}
