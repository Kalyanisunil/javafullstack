package basics;

import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str=new  String[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the values;");
		for(int i=0;i<str.length;i++)
			
		{
			str[i]=sc.nextLine();
			
		}
		System.out.print("Values:");
		for(int i=0;i<str.length;i++)	
		{
			
		  System.out.println(str[i]);
		}
		
		

	}

}
