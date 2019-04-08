package taskAns.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_08 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int max_value = 0;

		for( int i = 0 ; i < 10 ; i++ ) {
			int value = Integer.parseInt( br.readLine() );
			if( value > max_value )
				max_value = value;
		}
	}
}
