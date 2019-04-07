package task.task1;

public class Task1_10 {

	public static void main( String[] args ) {

		answer1();
		answer2();
	}

	public static void answer1() {

		int x = 3;

		System.out.println( "解答" );
		System.out.println( x );
		System.out.println( x * x );
		System.out.println( x * x * x );
	}

	public static void answer2() {

		int x = 3;

		System.out.println( "別解" );
		System.out.println( Math.pow( x, 1 ) );
		System.out.println( Math.pow( x, 2 ) );
		System.out.println( Math.pow( x, 3 ) );
	}
}
