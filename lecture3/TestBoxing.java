public class TestBoxing {
	public static void main (String[] args) {
	
		long start, stop;
		
		long s1 =  (long) 0;
		
		start = System.currentTimeMillis();
		for (int j = 0; j < 100000000; j++ ) {
			s1 = s1 + (long) 1; 
		}
		stop = System.currentTimeMillis();
		
		System.out.println("Elapsed time (loop 1): " + (stop - start));


		Long s2 = (long) 0;
		
		start = System.currentTimeMillis();
		for (int j=0; j<100000000; j++ ) {
			s2 = s2 + (long) 1;
		}		
		stop = System.currentTimeMillis();

		System.out.println("Elapsed time (loop 2): " + (stop - start));

		
	}
}

		//long start, stop, elapsed;
		//start = System.currentTimeMillis();
		//stop = System.currentTimeMillis();
		//elapsed = stop - start;