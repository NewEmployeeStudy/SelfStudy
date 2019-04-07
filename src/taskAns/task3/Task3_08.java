package taskAns.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_08 {

	final static int SCORE_130 = 130;
	final static int SCORE_100 = 100;
	final static int SCORE_90 = 90;
	final static int SCORE_60 = 60;

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int score1 = Integer.parseInt( br.readLine() );
		int score2 = Integer.parseInt( br.readLine() );

		answer1( score1, score2 );
		answer2( score1, score2 );
	}

	public static void answer1( int score1, int score2 ) {

		System.out.println( "解答" );
		if( score1 >= SCORE_60 && score2 >= SCORE_60 )
			System.out.println( "合格" );
		else if( ( score1 + score2 ) >= SCORE_130 )
			System.out.println( "合格" );
		else if( ( score1 + score2 ) >= SCORE_100 && ( score1 >= SCORE_90 || score2 >= SCORE_90 ) )
			System.out.println( "合格" );
		else
			System.out.println( "不合格" );
	}

	public static void answer2( int score1, int score2 ) {

		System.out.println( "別解" );
		if( ( score1 >= SCORE_60 && score2 >= SCORE_60 )
				|| ( ( score1 + score2 ) >= SCORE_130 )
				|| ( ( score1 + score2 ) >= SCORE_100 && ( score1 >= SCORE_90 || score2 >= SCORE_90 ) ) )
			System.out.println( "合格" );
		else
			System.out.println( "不合格" );
	}
}
