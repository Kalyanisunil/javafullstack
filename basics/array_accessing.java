package basics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class array_accessing {

	public static void main(String[] args) {
	
		//I'm defining a class named people so that I can create a <ArrayList> of people to form an array of people 
		
		//class name:People
		  boolean found=false;
		ArrayList<People> people = new ArrayList<People>();
		people.add(new People(1,"Rajesh"));
		people.add(new People(2,"Rahul"));
		people.add(new People(3,"Shruti"));
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		for( People person:people)
		{
		   if(person.id==id)
		   {
			   System.out.println(person.name);
			    found=true;
		   }
		  
		 
		}
		  if(!found)
		   {
			   System.out.println("Person with ID " + id + " not found.");
		   }
//		
		sc.close();
		  
	}

}
