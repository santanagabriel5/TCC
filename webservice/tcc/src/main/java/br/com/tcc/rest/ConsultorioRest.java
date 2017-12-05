package br.com.tcc.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tcc.dao.ConsultorioDAO;
import br.com.tcc.model.Consultorio;

@Path("/")

public class ConsultorioRest {
	
	@Inject
	private ConsultorioDAO consultorioDAO;

	@GET
	@Path("/consultorio")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Consultorio> getConsultorio() {
		
		return consultorioDAO.getConsultorio();
	}

	
	@GET
	@Path("/consultorio/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Consultorio getConsultorio(@PathParam("id") Long idconsultorio) {
		
		return consultorioDAO.getConsultorio(idconsultorio);
	}

}
