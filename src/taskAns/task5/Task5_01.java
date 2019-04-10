package taskAns.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_01 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int values[] = new int[10];

		for( int i = 0 ; i < 10 ; i++ )
			values[i] = Integer.parseInt( br.readLine() );

		System.out.println();

		System.out.println( "解答" );
		for( int i = 0 ; i < 10 ; i++ )
			System.out.println( values[i] * 2 );

		System.out.println( "別解" );
		for( int n : values )
			System.out.println( n * 2 );
	}
}
