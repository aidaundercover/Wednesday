
public class Circle extends Shape{
	protected double radius= 1.0;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color,boolean filled){
		super(color,filled);

		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		super(color,filled);
		
		return "Circle[Shape[color = " + color + ",filed = " + String.valueOf(filled) + "],radius =" + String.valueOf(radius)+"]";
	}
}
