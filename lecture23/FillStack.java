public class FillStack {
	public static void call(int i) {
		try {
			System.out.println("Depth: " + i);
			call (i+1);
		} catch (Throwable e) {
			System.out.println("\nError: " + e.getClass() + " at depth: " + i);
		}
	}
	
	public static void main (String[] args) {
		call(0);
	}

}