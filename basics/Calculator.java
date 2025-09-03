package basics;

public class Calculator {
   int a,b,res;
   
   Calculator(int a ,int b)
   {
	   this.a=a;
	   this.b=b;
   }
   
   public void add(int x, int y)
   {
	   res=x+y;
	   System.out.println(res);
   }
   public void subtract(int x, int y)
   {
	   res=x-y;
	   System.out.println(res);
   }
   public void multiply(int x, int y)
   {
	   res=x*y;
	   System.out.println(res);
   }
   public void divide(int x, int y)
   {
	   res=x/y;
	   System.out.println(res);
   }
	
}


