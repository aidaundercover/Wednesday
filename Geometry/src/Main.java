public class Main{
	
	public static void main(String [] args) {
		Circle c = new Circle(45);
		Rectangle r = new Rectangle(78, 12);
		Square s = new Square(56);
		
		System.out.println(c.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(s.toString());
}
}