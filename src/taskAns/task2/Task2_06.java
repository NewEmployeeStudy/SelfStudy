package taskAns.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_06 {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.println( "あなたの年齢は？ ");
		int age = Integer.parseInt( br.readLine() );

		System.out.println( "生まれてから今まで、およそ" + ( age * 365 ) + "日です" );
	}
}
