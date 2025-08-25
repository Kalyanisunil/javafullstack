package basics;

public class parameterizedConstructors {

	String name=" ";
	String place=" ";
	
	public void  display()
	{
	
		System.out.print("The student name is:" );
		System.out.print(name);
		System.out.println();
		System.out.print("The student is from :" );
		System.out.print(place);
		System.out.println();
	}
	
	parameterizedConstructors(String name,String place)
	{
		this.name=name;
		this.place=place;
	}
	
	   public static void main(String args[]){ 
		   parameterizedConstructors student1= new parameterizedConstructors("Kalyani","Kallambalam");
		   parameterizedConstructors student2= new parameterizedConstructors("Aravind","Pathanamthitta");
		   parameterizedConstructors student3= new parameterizedConstructors("Keerthi","Manacaud");
		   
		   student1.display();
		   student2.display();
		   student3.display();
	   }
}
