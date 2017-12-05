package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Especialidade;

public class EspecialidadeDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Especialidade> getEspecialidade() {

		return em.createQuery("select e from Especialidade e where e.ativado = true order by e.nome", Especialidade.class).getResultList();
	}
	
	public Especialidade getEspecialidade(Long id) {
		
		return em.find(Especialidade.class, id);
	}
}
