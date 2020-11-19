
public abstract class Shape{
	protected String color = "red";
	protected boolean filled = true;
	
	Shape(){
	  color = "transperent";
	  filled = false;
    }
	
	Shape(String color,boolean filled){
	   this.color = color;
	   this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setisFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public String toString() {
		return "Shape[color = " + color + ",filed = " + String.valueOf(filled) + "]";
	}
	
}
