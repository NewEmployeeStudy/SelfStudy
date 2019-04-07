package taskAns.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_03 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );

		answer1( x );
		answer2( x );
	}

	public static void answer1( int x ) {

		System.out.println( "解答" );
		System.out.println( x );
		System.out.println( x * x );
		System.out.println( x * x * x );
	}

	public static void answer2( int x ) {

		System.out.println( "別解" );
		System.out.println( Math.pow( x, 1 ) );
		System.out.println( Math.pow( x, 2 ) );
		System.out.println( Math.pow( x, 3 ) );
	}
}
