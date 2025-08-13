package basics;

public class OddSumEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0 ,sumEven=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				
				sumEven=sumEven+i;
			}
		}
		
		System.out.println("SUM OF EVEN NUMBERS:"+sumEven);
	
		for(int i=1;i<=30;i++)
		{
			if(i%2!=0)
			{
			
				sumOdd=sumOdd+i;
			}
		}
		System.out.println(" Sum OF ODD NUMBERS:" + sumOdd);

	}

}
