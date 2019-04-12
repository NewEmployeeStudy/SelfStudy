package taskAns.task6;

import java.io.IOException;

public class Task6_04 {

	public static void main( String[] args ) throws IOException {

		DrawTriangle( 3 );
		System.out.println();
		DrawTriangle( 4 );
		System.out.println();
		DrawTriangle( 5 );
	}

	static void DrawTriangle( int size ) {
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = 0 ; j <= i ; j++ )
				System.out.print( "$" );

			System.out.println();
		}
	}
}
