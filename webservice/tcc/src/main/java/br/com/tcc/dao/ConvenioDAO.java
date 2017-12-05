package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Convenio;

public class ConvenioDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Convenio> getConvenio() {

		return em.createQuery("select c from Convenio c where c.ativado = true order by c.nome", Convenio.class).getResultList();
	}
	
	public Convenio getConvenio(Long id) {
		
		return em.find(Convenio.class, id);
	}
}
