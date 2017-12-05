package br.com.tcc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "Medico_Especialidade.findAll", query = "SELECT me FROM Medico_Especialidade me")
public class Medico_Especialidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Long medico_id;
	private Long especialidade_id;
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
	public Long getEspecialidade_id() {
		return especialidade_id;
	}
	public void setEspecialidade_id(Long especialidade_id) {
		this.especialidade_id = especialidade_id;
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
