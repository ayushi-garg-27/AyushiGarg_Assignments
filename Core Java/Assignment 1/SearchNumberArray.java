package assignment.first.java;

import java.util.Scanner;

public class SearchNumberArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		int n = arr.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==number)
			{
				System.out.println("number is present");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("number is not present");
		}
	}

}
