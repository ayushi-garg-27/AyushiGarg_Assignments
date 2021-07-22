package assignment4.java;

public class ArithmeticOperation_Ques_1 {
	
	public void show(Calculate calculate) {
		calculate.arithmeticCaculations(20, 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperation_Ques_1 object = new ArithmeticOperation_Ques_1();
		
		Calculate add = (a1, a2) -> System.out.println(a1+a2);
		//add.arithmeticCaculations(5, 10);
		object.show(add);
		
		Calculate substract = (s1, s2) -> System.out.println(s1-s2);
		object.show(substract);
		
		Calculate multiply = (m1, m2) -> System.out.println(m1*m2);
		object.show(multiply);
		
		Calculate divide = (d1, d2) -> System.out.println(d1/d2);
		object.show(divide);
			

	}
	
	
interface Calculate{
	public void arithmeticCaculations(float a, float b);
}

}
