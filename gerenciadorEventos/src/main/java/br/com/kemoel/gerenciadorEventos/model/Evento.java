package br.com.kemoel.gerenciadorEventos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Table(name="evento",  schema = "gerenciador_eventos")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@NotBlank
	@Column(name="nome")
	private String nome;
	@NotBlank
	@Column(name="local")
	private String local;
	@NotBlank
	@Column(name="data")
	private String data;

	@Column(name="hora")
	private String hora;
	@OneToMany
	private List<Pessoa> pessoas;
	
	
	
}
