package taskAns.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_03 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Dog2 dog1 = new Dog2();
		Dog2 dog2 = new Dog2();

		System.out.println( "一匹目" );
		dog1.setName( br.readLine() );
		dog1.setAge( Integer.parseInt( br.readLine() ) );
		System.out.println( "二匹目" );
		dog2.setName( br.readLine() );
		dog2.setAge( Integer.parseInt( br.readLine() ) );

		System.out.println( "一匹目" );
		dog1.showProfile();
		System.out.println( "二匹目" );
		dog2.showProfile();
	}
}
