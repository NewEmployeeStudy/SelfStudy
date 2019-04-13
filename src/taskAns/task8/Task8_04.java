package taskAns.task8;

import java.io.IOException;

public class Task8_04 {
	public static void main( String[] args ) throws IOException {

		Animal2[] animal = new Animal2[4];

		for( int i = 0 ; i < 4 ; i++ ) {
			if( i % 2 == 0 ) {
				animal[i] = new Cat2();
			} else {
				animal[i] = new Dog2();
			}
		}

		for( Animal2 pet : animal ) {
			pet.speak();
		}
	}
}
