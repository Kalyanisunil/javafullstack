package basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the numbers;");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
			
			
		}
		System.out.print("The numbers");
		for(int i=0;i<arr.length;i++)
		{

			
			System.out.println(arr[i]);
			
			
		}
		sc.close();
		
		
		
		
	
	}

}
