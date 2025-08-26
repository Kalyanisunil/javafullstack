import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Hello Everyone!";
		try {
			File file= new File("writing_here.txt");
			FileWriter writer=new FileWriter(file);
			writer.write(data);
			writer.close();
			char [] array= new char[100];
			FileReader reader = new FileReader("writing_here.txt");
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
