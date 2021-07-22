package assignment.first.java;
import java.util.*;
import java.util.Scanner;

public class TotalAndAvergaeMarks {
	int A,B,C,i, sum=0;
	public static void main (String argu[ ])
	{
		int totalA=0, totalB=0, totalC=0,i, avgA=0, avgB=0, avgC=0;
		Scanner sc=new Scanner (System. in);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		for(i=0;i<3;i++) {
			    System.out.println("Marks of Students for subject A:");
			    a[i]=sc.nextInt();	
		}
		for(i=0;i<3;i++) {
		    System.out.println("Marks of Students for subject B:");
		    b[i]=sc.nextInt();	
		}
		for(i=0;i<3;i++) {
		    System.out.println("Marks of Students for subject C:");
		    c[i]=sc.nextInt();	
		}
		for(i=0;i<3;i++) {
		    totalA +=a[i];
		    totalB +=a[i];
		    totalC +=a[i];
		    avgA=totalA/3;
		    avgA=totalB/3;
		    avgA=totalC/3;
		}
		System.out.println("Total for subject A:"+totalA + "Average for subject A" + avgA);
		System.out.println("Total for subject B:"+totalB + "Average for subject B" + avgB);
		System.out.println("Total for subject C:"+totalC + "Average for subject C" + avgC);
		
		int student[]= new int[3];
		for(i=0;i<3;i++) {
			student[i] = a[i]+b[i]+c[i];
			
		}
		for(i=0;i<3;i++) {
			System.out.println("Student:" + (i+1) + " :");
			System.out.println("Total : " + student[i] + "Average: " + student[i]/3);
			
		}
		
		
		
	   
	}
	
}
