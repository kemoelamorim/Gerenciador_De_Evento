package br.com.gerenciaEventos.eventos.entidades;

public class Sala {
	
	private Long id;
	private String nome;
	private Integer lotacao;
	private Etapa etapa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getLotacao() {
		return lotacao;
	}
	public void setLotacao(Integer lotacao) {
		this.lotacao = lotacao;
	}
	public Etapa getEtapa() {
		return etapa;
	}
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
}
