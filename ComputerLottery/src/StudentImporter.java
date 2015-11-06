import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class StudentImporter {
	
	/** Parse a CSV file containing Student objects*/
	public static ArrayList<Student> importStudents(String filePath){
		
		ArrayList<Student> students = new ArrayList<Student>();

		try {
			
			InputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis, Charset.forName("ISO-8859-1"));
			BufferedReader br = new BufferedReader(isr);
			 
			String line;
			while ((line = br.readLine()) != null){
				String[] studentCsv = line.split(",");
				
				Student student = new Student(studentCsv[0], Integer.parseInt(studentCsv[1]));
				students.add(student);
			}
			
			br.close();
			isr.close();
			fis.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Could not find file " + filePath);
			System.exit(0);
		}
		catch (Exception fe){
			System.out.println("Fatal exception on StudentImporter");
			fe.printStackTrace();
			System.exit(0);
		}
		
		return students;
		
	}
	
}
