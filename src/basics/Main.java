package basics;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");	
		int num=sc.nextInt();
		
		System.out.println("Enter a number:");	
		int num2=sc.nextInt();
		
		System.out.println("Enter a number:");	
		int num3=sc.nextInt();
		
//	
//		if(num>0)
//		{
//			System.out.println("The number is positive!");
//		}
//		else if(num<0)
//		{
//			System.out.println("The number is negative!!");
//		}
//		else if(num==0)
//		{
//			System.out.println("The number is 0!");
//		}
//		else {
//			System.out.println("The number is invalid!");
//		}
//		
		// ODD OR EVEN
//		
//		if(num%2==0)
//		{
//			System.out.println("The number is even!");
//		}
//		else {
//			System.out.println("The number is odd!");
//		}
//		
		
		//MULTIPLES OF 3 AND 5
//		if(num%3==0 && num%5==0)
//		{
//			System.out.println("The number is a multiple of 3 and 5!");
//		}
//		else if(num%5==0)
//		{
//			System.out.println("The number is a multiple of 5!");
//		}
//		else if(num%3==0 )
//		{
//			System.out.println("The number is a multiple of 3");
//		}
//		
		
		// 2 NUMBERS GREATER 
//		if(num2>num3)
//		{
//			System.out.println(num2+" Is greater");
//		}
//		else {
//			System.out.println(num3+" Is greater");
//		}
		
//		3 NUMBERS GREATER
		
		if(num>num2 && num>num3)
		{
			System.out.println(num+" Is greater");
		}
	
		else if(num2>num3 )
		{
			System.out.println(num2+" Is greater");
		}
		else {
			System.out.println(num3+" Is greater");
		}
		
		
	}
	}

