public class TestCompare {

	public static void main (String args[]) {
	
		MyInteger a = new MyInteger(5);
		MyInteger b = new MyInteger(10);

		if (a.equals(b)) {
			System.out.println( "a and b have the same content");
		}
		else {
			System.out.println( "a and b do NOT have the same content");			
		}
	}
}