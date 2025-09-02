package basics;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("Enter number:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+" * "+ n+ " = "+i*n);
		}
	}

}
