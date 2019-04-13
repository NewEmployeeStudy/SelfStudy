package taskAns.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_03 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		Cat2 cat = new Cat2();
		Dog2 dog = new Dog2();

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

		cat.speak();
		dog.speak();
	}
}

class Dog2 extends Animal2 {
	public void run() {
		System.out.println( "TikTok...TikTok..." );
	}

	@Override
	public void speak() {
		System.out.println( "BowWow" );
	}
}

class Cat2 extends Animal2 {
	public void sleep() {
		System.out.println( "Zzz...Zzz..." );
	}

	@Override
	public void speak() {
		System.out.println( "Meow" );
	}
}

class Animal2 {
	public String Name;
	public int Age;

	public void showProfile() {
		System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
	}

	public void speak() {
		System.out.println( "・・・・・・・・・・" );
	}
}
