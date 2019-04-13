package taskAns.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_01 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Cat cat = new Cat();
		System.out.println( "年齢は？" );
		cat.Age = Integer.parseInt( br.readLine() );
		System.out.println( "名前は？" );
		cat.Name = br.readLine();

		cat.showProfile();
		cat.sleep();
	}
}

class Cat extends Animal {
	public void sleep() {
		System.out.println( "Zzz...Zzz..." );
	}
}

class Animal {
	public String Name;
	public int Age;

	public void showProfile() {
		System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
	}
}
