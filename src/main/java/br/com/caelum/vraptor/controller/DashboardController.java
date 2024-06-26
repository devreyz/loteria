package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Usuario;

@Path("dashboard")
@Controller
public class DashboardController {
	
	@Inject EntityManager em;
	@Inject Result result;
	
	@Get("")
	public void dashboard() {
		
	}
	
	@Post("salvausuario")
	public void salvausuario(Usuario usuario) {
		
		em.persist(usuario);
		
		result.redirectTo(DashboardController.class).dashboard();
	}

}
