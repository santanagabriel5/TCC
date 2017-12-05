package br.com.tcc.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tcc.dao.MedicoDAO;
import br.com.tcc.model.Medico;

@Path("/")
public class MedicoRest {
	
	
	@Inject
	private MedicoDAO medicoDAO;

	@GET
	@Path("/medico")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Medico> getMedico() {
		
		return medicoDAO.getMedico();
	}

	
	@GET
	@Path("/medico/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Medico getMedico(@PathParam("id") Long idMedico) {
		
		return medicoDAO.getMedico(idMedico);
	}
	
	@GET
	@Path("/mediconome/{nome}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Medico> getMedico(@PathParam("nome") String nome) {
		
		return medicoDAO.pesquisaMedico(nome);
	}

}
