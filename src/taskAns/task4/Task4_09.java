package taskAns.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_09 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int max_value = 0, min_value = 0;

		System.out.println( "解答" );
		answer1( br, max_value, min_value );
		System.out.println( "別解１" );
		answer2( br, max_value, min_value );
		System.out.println( "別解２" );
		max_value = Integer.parseInt( br.readLine() );
		min_value = max_value;
		answer3( br, max_value, min_value );
	}

	public static void answer1( BufferedReader br, int max_value, int min_value ) throws IOException {

		for( int i = 0 ; i < 10 ; i++ ) {
			int value = Integer.parseInt( br.readLine() );

			if( i == 0 ) {
				max_value = value;
				min_value = value;
			} else {
				if( value > max_value )
					max_value = value;
				if( value < min_value )
					min_value = value;
			}
		}
		System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
	}

	public static void answer2( BufferedReader br, int max_value, int min_value ) throws IOException {

		for( int i = 0 ; i < 10 ; i++ ) {
			int value = Integer.parseInt( br.readLine() );

			if( i == 0 || value > max_value )
				max_value = value;
			if( i == 0 || value < min_value )
				min_value = value;
		}

		System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
	}

	public static void answer3( BufferedReader br, int max_value, int min_value ) throws IOException {

		for( int i = 1 ; i < 10 ; i++ ) {
			int value = Integer.parseInt( br.readLine() );

			if( value > max_value )
				max_value = value;
			if( value < min_value )
				min_value = value;
		}

		System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
	}
}
