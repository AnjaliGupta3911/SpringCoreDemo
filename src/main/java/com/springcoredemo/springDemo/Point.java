package com.springcoredemo.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("point3")
public class Point {
	@Value("33")
	private int x;
	@Value("44")
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	Point(){}

}
