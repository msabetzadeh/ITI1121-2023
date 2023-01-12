public class TestBoxing {
	public static void main (String[] args) {
	
		long s1 = (long) 0;
		for (int j = 0; j < 100000000; j++ ) {
			s1 = s1 + (long) 1; 
		}

		Long s2 = (long) 0;
		for (int j=0; j<100000000; j++ ) {
			s2 = s2 + (long) 1;
		}		
		
	}
}

		//long start, stop, elapsed;
		//start = System.currentTimeMillis();
		//stop = System.currentTimeMillis();
		//elapsed = stop - start;