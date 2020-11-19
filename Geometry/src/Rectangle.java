
public class Rectangle extends Shape{
    public double length;
    public double width;
    Rectangle(double x, double y, double l, double w){
    	super(x,y);
    	length = l;
    	width = w;
    }
    
    public double calcArea() {
    	return length*width;
    }
}
