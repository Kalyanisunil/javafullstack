package basics;

import java.util.Scanner;

public class calculator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while(flag==1)
		{
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.print("Enter the first number:");
		int b=sc.nextInt();
		Calculator c=new Calculator(a,b);
		
		
		System.out.println(" Choose the option for  operation :");
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.X");
		System.out.println("4./");
		System.out.println("5.Exit");
		int op=sc.nextInt();
		
		switch(op)
		{
		case 1:
			c.add(a,b);
			break;
		case 2:
			c.subtract(a,b);
			break;
		case 3:
			c.multiply(a,b);
			break;
		case 4:
			c.divide(a,b);
			break;
		case 5:
			sc.close();
			System.out.print("Exiting..");
			flag=0;
			
			break;
		default:
			System.out.print("Invalid option");
			break;
		}

	}

}
}
