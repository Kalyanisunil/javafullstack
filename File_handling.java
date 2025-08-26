
import java.io.*;
public class File_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] array= new char[100];
			try {
				FileReader reader = new FileReader("input");
				reader.read(array);
				 System.out.println(array);
				reader.close();
			}
			catch(Exception e)
			{
				 e.getStackTrace();
			}
				
	}

}
