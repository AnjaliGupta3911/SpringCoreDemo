package com.springcoredemo.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("circle3")
public class Circle {
	
	Point center;
	
	@Autowired
	Circle(@Qualifier("point3") Point p){
		center = p;
	}
	
	Circle(){ 	}
	
	public Point getCenter() {
		return center;
	}

	//@Required
	
	public void setCenter(Point center) {
		this.center = center;
	}

	void draw(){
		System.out.println("inside circle x:"+center.getX()+" y:"+center.getY());
	}

}
