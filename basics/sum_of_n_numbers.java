package basics;

import java.util.Scanner;

public class sum_of_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum=0;
		Scanner input = new Scanner(System.in); // create an object of Scanner
		int number = input.nextInt();
		System.out.println("Enter the number:");
		
		for(int i=1;i<=number;i++)
		{
			sum+=i;
		}
		
		System.out.println("Sum of "+number+" numbers "+ sum);
		input.close();
	}

}
