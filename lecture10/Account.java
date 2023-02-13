public class Account {
	private int id;
	private String name;
	
	public Account (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals (Object o) {
		boolean result = true;
		
		if (o == null) { 
			result = false;
		} else if (this.getClass() != o.getClass()) {
			result = false;
		} else {
			Account other = (Account) o;
			
			if (this.id != other.id) {
				result = false;
			} else if (name == null && other.name !=null){
				result = false;
			} else if (name != null && !name.equals(other.name)) {
				result = false;
			}
		}
	
		return result;
	}
	
	public static void main (String args[]) {
	
		Account a = new Account (1, null);
		Account b = new Account (1, null);
		
		System.out.println(a.equals(b));
		
		Account a1 = new Account (1, "Steve");
		Account b1 = new Account (1, "John");
		
		System.out.println(a1.equals(b1));

		
	}
}