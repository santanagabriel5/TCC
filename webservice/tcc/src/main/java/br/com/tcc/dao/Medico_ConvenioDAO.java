package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Medico_Convenio;


public class Medico_ConvenioDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Medico_Convenio> getMedico_Convenio() {

		return em.createQuery("select mc from Medico_Convenio mc", Medico_Convenio.class).getResultList();
	}
	
	public Medico_Convenio getMedico_Convenio(Long id) {
		
		return em.find(Medico_Convenio.class, id);
	}
}
