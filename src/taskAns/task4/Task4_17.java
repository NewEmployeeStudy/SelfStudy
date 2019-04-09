package taskAns.task4;

import java.io.IOException;

public class Task4_17 {

	public static void main( String[] args ) throws IOException {

		for( int p = 1 ; p <= 9 ; p++ ) {
			for( int q = 1 ; q <= 9 ; q++ )
				System.out.printf( " %2d", p * q );
			System.out.println();
		}
	}
}
