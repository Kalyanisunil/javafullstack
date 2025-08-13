package basics;

public class forLoops {

	public static void main(String[] args) {
		
		
		int n=10;
		System.out.println("PRINTING 1-10  WITH FOR LOOP: ");	
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);		
		}
		
		System.out.println("PRINTING 10-1  WITH FOR LOOP: ");	
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);	
		}
		
		
		System.out.println("PRINTING 1-10  WITH WHILE LOOP: ");	
		
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
		
		
		System.out.println("PRINTING 10-1  WITH WHILE LOOP: ");	
		int j=10;
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
		
		
	
		
		
	}

}
