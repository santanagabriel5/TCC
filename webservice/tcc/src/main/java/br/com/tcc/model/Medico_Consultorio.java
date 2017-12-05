package br.com.tcc.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Medico_Consultorio.findAll", query = "SELECT mc FROM Medico_Consultorio mc")
public class Medico_Consultorio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Long medico_id;
	private Long consultorio_id;
	private int dia;
	private Time entrada;
	private Time saida;
	private Date created_at;
	private Date updated_at;
	private boolean ativado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMedico_id() {
		return medico_id;
	}
	public void setMedico_id(Long medico_id) {
		this.medico_id = medico_id;
	}
	public Long getConsultorio_id() {
		return consultorio_id;
	}
	public void setConsultorio_id(Long consultorio_id) {
		this.consultorio_id = consultorio_id;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public Time getEntrada() {
		return entrada;
	}
	public void setEntrada(Time entrada) {
		this.entrada = entrada;
	}
	public Time getSaida() {
		return saida;
	}
	public void setSaida(Time saida) {
		this.saida = saida;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public boolean isAtivado() {
		return ativado;
	}
	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}

}
