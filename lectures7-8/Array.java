public class Array {

	public static void sort2(Comparable[] array) {
	
		if (array[0].compareTo(array[1]) > 0) {
		
			Comparable temp = array[0];
			array[0] = array[1];
			array[1] = temp;	
		}
	
	}

}