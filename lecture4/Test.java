
public class Test {
	
	public static void change(String s) {
		s = s + "Something!";
	
	}
	
	public static void main(String[] args) {
		String s = "My main string!";
		
		change (s);
		
		System.out.println(s);
		
	} 

}