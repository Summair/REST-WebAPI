package com.summair.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Objectcall")

public class ObjectResource 
{
	ObjectRepository repo = new ObjectRepository();
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Object> getObject() {
		
		
		System.out.print("Object called.....");
		
		
		
		return repo.getObjects();
	}
	
	@POST
	@Path("objectCreate")
	public Object creatObject(Object a1) {
		
		
		System.out.println(a1);
		repo.create(a1);
		return a1;
		
	}
}
