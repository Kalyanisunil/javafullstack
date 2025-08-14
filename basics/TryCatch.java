package basics;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your first number:");
		int input1=sc.nextInt();
		System.out.println("Enter your second number:");
		int input2=sc.nextInt();
		if(input2==0)
		{
			try {
				int div=input1/input2;
				System.out.println(div);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception----- Division by zero  is Undefined!");
			}
			
			 finally {
				 System.out.println("Program has run successfully!");
			 }
		}
		else {
			int div=input1/input2;
			System.out.println(div);
		}
		sc.close();
		
	}
		

}
