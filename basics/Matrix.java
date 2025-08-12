package basics;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
		int[][] b = new int[3][4];
		int[][] sum = new int[3][4];
		int[][] diff = new int[3][4];
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the values for array-1:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values for array-2:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("These are the arrays:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
				
			}
			 System.out.println();
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j] + " ");
				
			}
			 System.out.println();
		}
		
		
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				sum[i][i]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("The sum of both matrices:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(sum[i][j] + " ");
				
			}
			 System.out.println();
		}
		
		System.out.println("The diff of both matrices:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(diff[i][j] + " ");
				
			}
			 System.out.println();
		}
		sc.close();

	}

}
