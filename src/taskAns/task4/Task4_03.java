package taskAns.task4;

import java.io.IOException;

public class Task4_03 {

	public static void main( String[] args ) throws IOException {

		answer1();
		answer2();
		answer3();
	}

	public static void answer1() {

		System.out.println( "解答" );

		int x = 1;
		for( int n = 1 ; n <= 8 ; n++ ) {
			x *= 2;
			System.out.println( "2の" + n + "乗=" + x );
		}
	}

	public static void answer2() {

		System.out.println( "別解１" );

		for( int n = 1, x = 2 ; n <= 8 ; n++, x *= 2 )
			System.out.println( "2の" + n + "乗=" + x );
	}

	public static void answer3() {

		System.out.println( "別解２" );

		for( int n = 1 ; n <= 8 ; n++ )
			System.out.println( "2の" + n + "乗=" + Math.pow( 2, n ) );
	}
}
