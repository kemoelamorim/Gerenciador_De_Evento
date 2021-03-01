package br.com.gerenciaEventos.eventos.entidades;

public enum Etapa {
	
	PRIMERA("primeira"),
	SEGUNDA("segunda");

	private String descricao;
	private String ambiente;
	
	Etapa(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		if (this.getDescricao() == "segunda") {
			this.ambiente = "Coffe 2";
		}else {
			this.ambiente = "Coffe 1";
		}
	}
	

}
