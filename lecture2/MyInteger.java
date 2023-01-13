public class MyInteger {
	private int value;
	
	public MyInteger (int value) {
		this.value = value;
	}

	public static void main (String[] args) {
		MyInteger i = new MyInteger (33);
		MyInteger alias = i;
		alias.value++;
		System.out.println(i.value);
	}

}
