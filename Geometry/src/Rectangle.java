
public class Rectangle extends Shape{
    protected double length = 1.0;
    protected double width = 1.0;
    
    Rectangle(){
    	
    }
    
    Rectangle(double width, double length){
    	this.length = length;
    	this.width = width;
    }
    
    Rectangle(double width, double length, String color, boolean filled){
    	super(color,filled);
    	this.length = length;
    	this.width = width;
    }
    
    public double getWidth() {
    	return width;
    }
    
    public void setWidth(double width) {
		this.width = width;
	}
    

	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2 * width * length;
	}
	
	public String toString() {
		super(color,filled);
		return "Rectangle[Shape[color = " + color + ",filed = " + String.valueOf(filled) + "],width =" + String.valueOf(width)+",length = "+ String.valueOf(length) + "]";
	}
}
