package assignment3.java;

import java.util.HashSet;

public class Question2_HashSet_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> MonthsName = new HashSet<>();

       
		MonthsName.add("January");
		MonthsName.add("Febuary");
		MonthsName.add("March");
		MonthsName.add("April");
		MonthsName.add("May");
		MonthsName.add("June");
		MonthsName.add("July");
		MonthsName.add("August");
		MonthsName.add("September");
		MonthsName.add("October");
		MonthsName.add("November");
		MonthsName.add("December");

        
		MonthsName.add("July");
		System.out.println(MonthsName);
        System.out.println("My favourite Month of the Year is September");

        

	}

}
