package taskAns.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_02 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Cat cat = new Cat();
		Dog dog = new Dog();

		System.out.println( "猫の年齢は？" );
		cat.Age = Integer.parseInt( br.readLine() );
		System.out.println( "名前は？" );
		cat.Name = br.readLine();

		System.out.println( "犬の年齢は？" );
		dog.Age = Integer.parseInt( br.readLine() );
		System.out.println( "名前は？" );
		dog.Name = br.readLine();

		cat.showProfile();
		dog.showProfile();

		cat.sleep();
		dog.run();
	}
}

class Dog extends Animal {
	public void run() {
		System.out.println( "TikTok...TikTok..." );
	}
}
