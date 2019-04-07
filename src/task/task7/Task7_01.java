package task.task7;

public class Task7_01 {


	class Dog {
		private String Name;
		public void SetName( String nm ) {
			Name = nm;
		}
		public void ShowProfile() {
			System.out.println( "名前は、" + Name + "です。" );
		}
	}
}
