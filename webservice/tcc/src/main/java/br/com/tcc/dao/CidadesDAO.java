package br.com.tcc.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.model.Cidades;

public class CidadesDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	public List<Cidades> getCidades() {

		return em.createQuery("select c from Cidades c order by c.nome", Cidades.class).getResultList();
	}
	
	public Cidades getCidade(Long id) {
		
		return em.find(Cidades.class, id);
	}
}
