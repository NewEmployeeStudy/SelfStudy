package taskAns.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_01 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Dog doc = new Dog();
		doc.setName( br.readLine() );
		doc.showProfile();
	}
}

class Dog {
	private String Name;
	public void setName( String nm ) {
		Name = nm;
	}
	public void showProfile() {
		System.out.println( "名前は、" + Name + "です。" );
	}
}
