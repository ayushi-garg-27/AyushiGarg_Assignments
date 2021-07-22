package assignment.second.java.first_Question.Singleton;

public class MainSingletone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletone x = Singletone.getInstance();
		
		System.out.println("String from x is " + x.s);

		Singletone y = Singletone.getInstance();
		
		System.out.println("String from y is " + y.s);
	}

}
