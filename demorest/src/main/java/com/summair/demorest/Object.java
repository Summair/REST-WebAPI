package com.summair.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Object 

{
	private String name;
	private int points;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

}
