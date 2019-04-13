package taskAns.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_04 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Dog3 dog = new Dog3( br.readLine() );
		dog.setName( br.readLine() );
		dog.setAge( Integer.parseInt( br.readLine() ) );

		dog.showProfile();
	}
}

class Dog3 {
	private String kind;
	private String name;
	private int age;

	public Dog3( String _kind ) {
		kind = _kind;
	}
	public void setName( String _name ) {
		name = _name;
	}
	public void setAge( int _age ) {
		age = _age;
	}
	public void showProfile() {
		System.out.println( "犬種は、" + kind + "です。名前は、" + name + "です。年齢は、" + age + "歳です。" );
	}
}
