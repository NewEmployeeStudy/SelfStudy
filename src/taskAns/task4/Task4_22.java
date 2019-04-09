package taskAns.task4;

import java.io.IOException;

public class Task4_22 {

	public static void main( String[] args ) throws IOException {

		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;

		while( n1 < 1000 ) {
			System.out.print( n1 + "," );

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
