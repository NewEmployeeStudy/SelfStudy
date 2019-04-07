package task.task1;

public class Task1_07 {

	public static void main( String[] args ) {

		int x, y, t;

		x = 3;
		y = 7;

		t = x;
		x = y;
		y = t;

		System.out.println( "x=" + x + ",y=" + y );
	}
}
