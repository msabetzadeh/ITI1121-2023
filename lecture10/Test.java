public class Test {

	public static void main (String[] args) {
	
		Circle c = new Circle(50, 10, 100);
		Rectangle r = new Rectangle(40, 50, 100, 200);
				
		Pair<Shape, Shape> p = new Pair<Shape, Shape> (r, c);
		Pair<String, String> p2 = new Pair<String, String> ("John", "Mary");
		
		Pair<Integer, Shape> p3 = new Pair <Integer, Shape> (1, r);
		
		int i = p3.getSecond();
		Shape s = p3.getSecond(); 
		
	}
}