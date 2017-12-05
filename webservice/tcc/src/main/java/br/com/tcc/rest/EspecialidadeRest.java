package br.com.tcc.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tcc.dao.EspecialidadeDAO;
import br.com.tcc.model.Especialidade;

@Path("/")
public class EspecialidadeRest {
	
	@Inject
	private EspecialidadeDAO especialidadeDAO;

	@GET
	@Path("/especialidade")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Especialidade> getEspecialidade() {
		
		return especialidadeDAO.getEspecialidade();
	}

	
	@GET
	@Path("/especialidade/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Especialidade getEspecialidade(@PathParam("id") Long idespecialidade) {
		
		return especialidadeDAO.getEspecialidade(idespecialidade);
	}


}
