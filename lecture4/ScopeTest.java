public class ScopeTest {

	public static void foo() {
		abc();
	}
	public static void main (String args[]) {
	
		foo();
		
	}
	
	public static void abc() {
		System.out.println(x);
	}
	
	static int y = 2;
	static int x = y + 5;

}
