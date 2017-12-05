package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Medico_Consultorio;

public class Medico_ConsultorioDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Medico_Consultorio> getMedico_Consultorio() {

		return em.createQuery("select mc from Medico_Consultorio mc", Medico_Consultorio.class).getResultList();
	}
	
	public Medico_Consultorio getMedico_Consultorio(Long id) {
		
		return em.find(Medico_Consultorio.class, id);
	}
}
