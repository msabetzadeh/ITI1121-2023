public class TestWrappers{

	public static void main (String[] args) {
	
		Integer i = 1;
		Integer alias = i;		
		i = i + 5;
		
		if (i == alias) {
			System.out.println("i and alias point to the same object");
		}
		
		else {
			System.out.println("i and alias do NOT point to the same object");			
		}
	}
}