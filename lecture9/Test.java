public class Test {

	public static void main (String[] args) {
					
		Shape c = new Circle(50, 10, 100);
		Shape r = new Rectangle(40, 50, 100, 200);
		
		Shape[] array = new Shape[2];
		array[0] = c;
		array[1] = r;
/*		
		System.out.println("Before sorting:");
		
		Graphics.displayAll(array);
		
		Array.sort2(array);

		System.out.println("After sorting:");
		
		Graphics.displayAll(array);
*/
		Displayable d = array[0];
		Comparable co = array[1];
		
		System.out.println(d.equals(co));	
		System.out.println(d.getClass());
		System.out.println(co.toString());
	}
}