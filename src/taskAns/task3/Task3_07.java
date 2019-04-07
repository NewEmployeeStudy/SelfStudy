package taskAns.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_07 {

	final static int SCORE_80 = 80;
	final static int SCORE_70 = 70;
	final static int SCORE_60 = 60;

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int score = Integer.parseInt( br.readLine() );

		answerCase1( score );
		answerCase2( score );
		answerCase3( score );
	}

	public static void answerCase1( int score ) {

		System.out.println( "ケース１" );
		if( score >= SCORE_60 )
			System.out.println( "合格" );
		else
			System.out.println( "不合格" );
	}

	public static void answerCase2( int score ) {

		System.out.println( "ケース２" );
		if( score >= SCORE_80 )
			System.out.println( "たいへんよくできました。" );
		else if( score >= SCORE_60 )
			System.out.println( "よくできました。" );
		else
			System.out.println( "ざんねんでした。" );
	}

	public static void answerCase3( int score ) {

		System.out.println( "ケース３" );
		if( score >= SCORE_80 )
			System.out.println( "優" );
		else if( score >= SCORE_70 )
			System.out.println( "良" );
		else if( score >= SCORE_60 )
			System.out.println( "可" );
		else
			System.out.println( "不可" );
	}
}
