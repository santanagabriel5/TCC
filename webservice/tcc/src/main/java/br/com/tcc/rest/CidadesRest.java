package br.com.tcc.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tcc.dao.CidadesDAO;
import br.com.tcc.model.Cidades;


@Path("/")
public class CidadesRest {
	
	@Inject
	private CidadesDAO cidadesDAO;

	@GET
	@Path("/cidades")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cidades> getCidades() {
		
		return cidadesDAO.getCidades();
	}

	
	@GET
	@Path("/cidades/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Cidades getCidades(@PathParam("id") Long idCidade) {
		
		return cidadesDAO.getCidade(idCidade);
	}

}
