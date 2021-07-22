package assignment.second.java.second_Question;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		double overTime = 500;
		double incentive = 5000;
		
		
		
		Labour l1=new Labour(1,"Arpit" ,20000);
        Labour l2=new Labour(2,"John" ,15000);
        Manager m1=new Manager(1,"Amit" ,30000);
        Manager m2=new Manager(2,"Ashwin" ,50000);
        Scanner sc = new Scanner(System.in);
        //m1.incentive=sc.nextDouble();
        //m2.incentive=sc.nextDouble();
        //l1.overTime=sc.nextDouble();
        //l2.overTime=sc.nextDouble(); 
        
        System.out.println(l1.getSalary()+overTime);
        System.out.println(l2.getSalary()+overTime);
        System.out.println(m1.getSalary()+incentive);
        System.out.println(m2.getSalary()+incentive);
 
	}

}
