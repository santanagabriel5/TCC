package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Medico;

public class MedicoDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Medico> getMedico() {

		return em.createQuery("select m from Medico m where m.ativado = true order by m.name", Medico.class).getResultList();
	}
	
	public List<Medico> pesquisaMedico(String nome) {

		return em.createQuery("select m from Medico m where m.name = %'"+nome+"'% order by m.name", Medico.class).getResultList();
	}
	
	public Medico getMedico(Long id) {
		
		return em.createQuery("select m from Medico m where m.ativado = true and m.id= "+id+" order by m.name", Medico.class).getSingleResult();
	}

}
