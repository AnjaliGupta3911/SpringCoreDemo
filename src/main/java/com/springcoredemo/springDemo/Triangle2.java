package com.springcoredemo.springDemo;

public class Triangle2 {

	private Point a;
	private Point b;
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
	
	Triangle2()
	{ 	}
	
	Triangle2(Point A, Point B)
	{
		a = A;
		b = B;
	}

	public void draw()
	{
		System.out.print("Triangle point a.x: "+a.getX()+" a.y: "+a.getY());
		System.out.println("  Triangle point b.x: "+b.getX()+" b.y: "+b.getY());
	}
}
