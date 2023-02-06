public abstract class Shape extends Comparable {

	protected double x;
	protected double y;

	
	public Shape () {
		this.x = 0;
		this.y = 0;
	}
	
	public Shape (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public final double getX() {
		return this.x;
	}
	
	public final double getY() {
		return this.y;
	}
	
	public final void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Located at: " + "(" + this.x + ", " + this.y + ")";
	}
	
	public boolean isLeftOf(Shape s) {
		return this.getX() < s.getX();
	}
	
	public abstract double area();
	
	public int compareTo(Comparable o) {
	
		Shape other = (Shape) o;
	
		if (this.area() < other.area()) {
			return -1;
		} else if (this.area() == other.area()) {
			return 0;
		} else {
			return 1;
		}
	}
	
	
	public static void myMethod() {
		System.out.println("I am a shape!");
	}

}