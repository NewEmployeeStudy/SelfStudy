package taskAns.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_02 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );

		if( x > y )
			System.out.println( x );
		else
			System.out.println( y );
	}
}
