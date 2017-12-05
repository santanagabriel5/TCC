package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Consultorio;

public class ConsultorioDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Consultorio> getConsultorio() {

		return em.createQuery("select c from Consultorio where c.ativado = true c order by c.nome", Consultorio.class).getResultList();
	}
	
	public Consultorio getConsultorio(Long id) {
		
		return em.find(Consultorio.class, id);
	}
}
