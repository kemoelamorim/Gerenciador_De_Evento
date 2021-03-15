package br.com.kemoel.gerenciadorEventos.dto;


import javax.validation.constraints.NotBlank;

import br.com.kemoel.gerenciadorEventos.model.Evento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoNovoEvento {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String local;
	@NotBlank
	private String data;
	
	private String hora;
	
	public Evento toEvento() {
		Evento evento = new Evento();
		evento.setNome(nome);
		evento.setLocal(local);
		evento.setData(data);
		evento.setHora(hora);
		
		return evento;
	}
}
