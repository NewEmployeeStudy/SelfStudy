package taskAns.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_11 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );

		int count = Integer.parseInt( br.readLine() );

		answer1( count );
		answer2( count );
	}

	public static void answer1( int count ) {

		System.out.println( "解答" );
		for( int i = 0, out = 0 ; i < count ; i++ ) {
			System.out.print( out++ );

			if( out > 9 )
				out = 0;
		}
	}

	public static void answer2( int count ) {

		System.out.println( "別解" );
		for( int i = 0 ; i < count ; i++ )
			System.out.print( i % 10 );
	}
}
