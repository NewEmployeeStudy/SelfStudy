package taskAns.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_04 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int values[] = new int[10];
		int cnt, sum;

		System.out.println( "解答" );
		for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ ) {
			values[cnt] = Integer.parseInt( br.readLine() );
			sum += values[cnt];
		}

		for( int i = 0 ; i < cnt ; i++ )
			System.out.print( "¥n" + values[i] );

		System.out.println( "別解" );
		cnt = 0;
		sum = 0;
		while( cnt < 10 && sum <= 100 ) {
			values[cnt] = Integer.parseInt( br.readLine() );
			sum += values[cnt++];
		}

		for( int i = 0 ; i < cnt ; i++ )
			System.out.print( "¥n" + values[i] );
	}
}
