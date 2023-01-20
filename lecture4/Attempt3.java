public class Attempt3 {
	

	public static void main(String[] args){

		// first point
		Point p1 = new Point(0,3);

		// second point
		Point p2 = new Point(1,1);
		System.out.println(Point.equal(p1,p2));

		Point p3 = Point.add(p1,p2);
		
		Point p4 = new Point3D(1, 1, 1);
		
		System.out.println(p3.toString());
		System.out.println(p4.toString());

	}
}
