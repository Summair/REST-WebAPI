package com.summair.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Objectcall")

public class ObjectResource 
{
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Object getObject() {
		
		
		System.out.print("Object called.....");
		
		Object a1 = new Object();
		a1.setName("Summair");
		a1.setPoints(100);
		
		return a1;
	}
	
}
