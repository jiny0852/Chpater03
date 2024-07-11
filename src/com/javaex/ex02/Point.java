package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	
	public Point() {
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

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
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Point p = (Point)obj;
			
		boolean result;
		if ( this.x == p.x && this.y == p.y ) {
			result = true;
			//return true;
		} else {
			result = false;
			//return false;
		}
		
		return result;
		//return super.equals(obj);
	}
	
	
	
	
	
	
	
	
	
	

}
