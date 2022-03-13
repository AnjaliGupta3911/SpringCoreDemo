package com.springcoredemo.springDemo;

import java.util.ArrayList;
import java.util.List;

public class Line {

	List<Point> points = new ArrayList<Point> ();

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	void draw() {
		for(Point p:points)
		{
			System.out.println("LinePoint a.x: "+p.getX()+" a.y: "+p.getY());
		}
	}

}
