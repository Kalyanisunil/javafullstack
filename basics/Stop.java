package basics;

import java.util.Scanner;

public class Stop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		boolean flag=true;
		while(flag)
		{
			System.out.println(name);
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("STOP"))
			{
				flag=false;
				
			}
			break;
		}
		sc.close();
	}

}
