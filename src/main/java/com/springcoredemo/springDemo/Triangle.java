package com.springcoredemo.springDemo;

public class Triangle {
	
	String type;
	int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Triangle(String t, int h) {
		type = t;
		height = h;
	}
	
	public Triangle(String t) 	{
		type = t;
	}
	
	public Triangle(int h) 	{
		height = h;
	}
	
	public Triangle()
	{
		
	}
	
	public void draw() {
		System.out.println("triangle drawn. Type is "+type+" height is "+height);
	}
}
