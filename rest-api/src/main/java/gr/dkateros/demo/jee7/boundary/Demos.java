package gr.dkateros.demo.jee7.boundary;

import java.net.URI;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import gr.dkateros.demo.jee7.control.DemoDao;
import gr.dkateros.demo.jee7.entity.Demo;

@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("demos")
public class Demos {
	
	@EJB DemoDao dao;
	
	@POST
	public Response add(JsonObject demo, @Context UriInfo info) {
		Demo d = dao.add(demo);
		URI uri = info.getAbsolutePathBuilder().path("/" + d.getId()).build();
		return Response.created(uri).entity(dao.json(d)).build();
	}
	
	@GET
	@Path("{id}")
	public Response find(@PathParam("id") Long id) {
		Demo demo = dao.find(id);
		if (demo == null) {
			return Response.status(Response.Status.NOT_FOUND).entity(id + " not found").build();
		}
		return Response.ok(dao.json(demo)).build();
	}

}
