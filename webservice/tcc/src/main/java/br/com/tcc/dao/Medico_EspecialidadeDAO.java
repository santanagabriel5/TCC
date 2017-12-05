package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Medico_Especialidade;

public class Medico_EspecialidadeDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Medico_Especialidade> getMedico_Especialidade() {

		return em.createQuery("select me from Medico_Especialidade me", Medico_Especialidade.class).getResultList();
	}
	
	public Medico_Especialidade getMedico_Especialidade(Long id) {
		
		return em.find(Medico_Especialidade.class, id);
	}
}
