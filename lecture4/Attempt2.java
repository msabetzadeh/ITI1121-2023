public class Attempt2 {
	
	public static boolean equal(Point p1, Point p2){
		return (p1.x==p2.x && p1.y==p2.y);
	}

	public static Point add(Point p1, Point p2){
		Point result = new Point();
		result.x = p1.x + p2.x;
		result.y = p1.y + p2.y;
		return result;
	}
	
	public static void printPoint(Point p) {
			System.out.println(p.x + ", " + p.y);
	}

	public static void main(String[] args){

		// first Point
		Point p1 = new Point();
		p1.x = 0;
		p1.y = 3;

		// second Point
		Point p2 = new Point();
		p2.x = 1;
		p2.y = 1;
		
		System.out.println(equal(p1,p2));

		Point p3 = add(p1,p2);
		
		printPoint(p3);
	}
}
