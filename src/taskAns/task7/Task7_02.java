package taskAns.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_02 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Dog2 dog = new Dog2();
		dog.setName( br.readLine() );
		dog.setAge( Integer.parseInt( br.readLine() ) );
		dog.showProfile();
	}
}

class Dog2 {
	private String name;
	private int age;

	public void setName( String _name ) {
		name = _name;
	}
	public void setAge( int _age ) {
		age = _age;
	}
	public void showProfile() {
		System.out.println( "名前は、" + name + "です。年齢は、" + age + "歳です。" );
	}
}
