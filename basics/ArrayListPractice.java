package basics;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> StudentList=new ArrayList<>();
		StudentList.add("Kallu");
		StudentList.add("Kavi");
		StudentList.add("Kichu");
		StudentList.add("Malu");
		StudentList.add("Appu");
		StudentList.add("Monu");
		StudentList.add("Nikki");
		StudentList.add("Gopu");
		StudentList.add("Leena");
		for(int i=0;i<StudentList.size();i++)
		{
			System.out.println(StudentList.get(i));
		}
		
		StudentList.set(2,"Krishna");
		
		for(int i=0;i<StudentList.size();i++)
		{
			System.out.println(StudentList.get(i));
		}
		
		StudentList.remove(8);
		for(int i=0;i<StudentList.size();i++)
		{
			System.out.println(StudentList.get(i));
		}
		
	}

}
