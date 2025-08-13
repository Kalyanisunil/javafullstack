package basics;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("The "+ i+" is a multiple of 3 and 5!");
			}
			else if(i%5==0)
			{
				System.out.println("The "+ i+" is a multiple of 5!");
			}
			else if(i%3==0 )
			{
				System.out.println("The "+ i+" is a multiple of 3!");
			}
		
		}
	}

}
