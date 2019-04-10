package taskAns.task5;

import java.io.IOException;

public class Task5_06 {

	public static void main( String[] args ) throws IOException {

		answer1();
		answer2();
	}

	public static void answer1() {
		System.out.println( "解答" );
		int kuku[][] = new int[9][];

		for( int i = 0 ; i < 9 ; i++ ) {
			kuku[i] = new int[9];

			for( int j = 0 ; j < 9 ; j++ )
				kuku[i][j] = ( i + 1 ) * ( j + 1 );
		}

		for( int i = 0 ; i < 9 ; i++ ) {
			for( int j = 0 ; j < 9 ; j++ )
				System.out.printf( " %2d", kuku[i][j] );

			System.out.println();
		}
	}

	public static void answer2() {
		System.out.println( "別解" );
		int kuku[][] = new int[9][9];

		for( int i = 0 ; i < 9 ; i++ )
			for( int j = 0 ; j < 9 ; j++ )
				kuku[i][j] = ( i + 1 ) * ( j + 1 );

		for( int i = 0 ; i < 9 ; i++ ) {
			for( int j = 0 ; j < 9 ; j++ )
				System.out.printf( " %2d", kuku[i][j] );

			System.out.println();
		}
	}
}
