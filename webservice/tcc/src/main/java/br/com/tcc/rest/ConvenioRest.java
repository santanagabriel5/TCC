package br.com.tcc.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tcc.dao.ConvenioDAO;
import br.com.tcc.model.Convenio;

@Path("/")
public class ConvenioRest {
	
	@Inject
	private ConvenioDAO convenioDAO;

	@GET
	@Path("/convenio")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Convenio> getConvenio() {
		
		return convenioDAO.getConvenio();
	}

	
	@GET
	@Path("/convenio/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Convenio getConvenio(@PathParam("id") Long idconvenio) {
		
		return convenioDAO.getConvenio(idconvenio);
	}

}
