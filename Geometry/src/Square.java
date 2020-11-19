
public class Square extends Rectangle{
     Square(){
    	 width=0;
    	 length = 0;
     }
     
     Square(double side){
    	 this.length = side;
    	 this.width = side;
     }
     
     Square(double side, String color, boolean filled){
     	super(color,filled);
     	this.length = side;
     	this.width = side;
     }
     
     public double getSide() {
     	return width;
     }
     
     public void setSide(double side) {
 		this.width =this.length = side;
 	}
    
     public void setWidth(double side) {
  		this.width = side;
  	}
     
     public void setLength(double side) {
  		this.width = side;
  	}
    
     public String toString() {
 		super(color,filled);
 		return "Squared[Shape[color = " + color + ",filed = " + String.valueOf(filled) + "],width =" + String.valueOf(width)+",length = "+ String.valueOf(length) + "]";
 	}
}
