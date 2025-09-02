package basics;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of rows:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
