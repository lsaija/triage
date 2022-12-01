package it.prova.triage.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DottoriResponseDTO {
	private String nome;
	private String cognome;
	private String codiceDottore;
	private boolean inVisita;
	private boolean inServizio;
	
	public DottoriResponseDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public DottoriResponseDTO(String nome, String cognome, String codiceDottore, boolean inVisita, boolean inServizio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceDottore = codiceDottore;
		this.inVisita = inVisita;
		this.inServizio = inServizio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceDottore() {
		return codiceDottore;
	}

	public void setCodiceDottore(String codiceDottore) {
		this.codiceDottore = codiceDottore;
	}

	public boolean isInVisita() {
		return inVisita;
	}

	public void setInVisita(boolean inVisita) {
		this.inVisita = inVisita;
	}

	public boolean isInServizio() {
		return inServizio;
	}

	public void setInServizio(boolean inServizio) {
		this.inServizio = inServizio;
	}
	
	

}
