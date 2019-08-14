package com.summair.demorest;

import java.util.ArrayList;
import java.util.List;

public class ObjectRepository 

{
	List<Object> objects;
	
	public ObjectRepository() {
		
		objects = new ArrayList<>();
		
		Object a1 = new Object();
		
		
		a1.setName("Summair");
		a1.setId(001);
		a1.setPoints(100);
		
		Object a2 = new Object();
		a2.setName("Sammy");
		a2.setId(002);
		a2.setPoints(100);
	
		objects.add(a1);
		objects.add(a2);
	}
	
	public List <Object> getObjects() {
		
		return objects;
	}

	public Object getObject(int id) {
		
		Object a1 = null;
		
		for (Object a : objects) {
			if (a.getId()== id)
			
				return a;
			
		}
		
		
		
		
		
		return null;
		
	}

	public void create(Object a1) {
		
		objects.add(a1);
		
	}
	
	
	
}
