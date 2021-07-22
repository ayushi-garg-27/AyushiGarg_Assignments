package assignment.first.java;

import java.util.Scanner;

public class IncomeTaxCalculation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0,AI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		AI=sc.nextDouble();
		if(AI<=180000)
			tax=0;
		else if(AI>=181001 && AI<=300000)
			tax=0.1*(AI-181000);
		else if(AI>=300000 && AI<=500000)
			tax=(0.2*(AI-300000))+(0.1*181000);
		else if(AI>=500000 && AI<=1000000)
			tax=(0.3*(AI-500000))+(0.2*300000)+(0.1*181000);
		
		System.out.println("Income tax amount is "+tax);

	}
}
