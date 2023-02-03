public class Test {

	public static void main (String[] args) {
					
		Shape c = new Circle(50, 10, 100);
		Shape r = new Rectangle(40, 50, 100, 200);
		
		Shape[] array = new Shape[2];
		array[0] = c;
		array[1] = r;
		
		System.out.println("Before sorting:");
		System.out.println(array[0]);
		System.out.println(array[1]);

		
		Array.sort2(array);

		System.out.println("After sorting:");
		System.out.println(array[0]);
		System.out.println(array[1]);		
	
	}
}