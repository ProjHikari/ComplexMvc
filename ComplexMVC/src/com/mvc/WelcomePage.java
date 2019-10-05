package com.mvc;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;

@Path("/WelcomePage")
public class WelcomePage{
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Path("/Welcome")
	public String sayPlainTextNegro(@FormParam("newname")String n) {
		System.out.println(n);
		return "<body bgcolor='#95d1c7'><h4>Welcome "+n+"!</body>";
	}
	@GET
	@Path("/Hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
    return "Hello World RESTful Jersey!";
	}
}
	
	



