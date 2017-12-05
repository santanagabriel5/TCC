package br.com.tcc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Medico_Convenio.findAll", query = "SELECT mc FROM Medico_Convenio mc")
public class Medico_Convenio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Long medico_id;
	private Long convenio_id;
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
	public Long getConvenio_id() {
		return convenio_id;
	}
	public void setConvenio_id(Long convenio_id) {
		this.convenio_id = convenio_id;
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
