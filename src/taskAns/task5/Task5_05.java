package taskAns.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_05 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int value = Integer.parseInt( br.readLine() );
		int binary[] = new int[16];

		for( int i = 15; i >= 0 ; i--, value /= 2 )
			binary[i] = value % 2;

		for( int i = 0 ; i < 16 ; i++ )
			System.out.print( binary[i] );
	}
}
