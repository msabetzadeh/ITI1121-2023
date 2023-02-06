public class Circle extends Shape {
	private double radius;
	
	public Circle () {
		super();
		this.radius = 0;
	}
	
	public Circle (double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getRadius () {
		return radius;
	}
		
	public String toString() {
		return "Circle located at: " + "(" + this.x + ", " + this.y + "), with radius " + radius;
	}
	
	public double area () {
		return Math.PI * radius * radius;
	}
	
	
	public static void myMethod() {
		System.out.println("I am a circle!");
	}
}