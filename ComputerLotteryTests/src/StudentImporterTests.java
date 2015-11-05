import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentImporterTests {

	
	@org.junit.Test public void TestImportFile(){
		String filePath = "C:\\Users\\Truls\\Desktop\\StudentTest.txt";
		
		ArrayList<Student> students = StudentImporter.importStudents(filePath);
		
		assertTrue(students.size() == 5);
		assertTrue(students.get(0).getName().equalsIgnoreCase("Truls"));
		assertTrue(students.get(0).getNumberOfAttendances() == 15);
		assertTrue(students.get(1).getName().equalsIgnoreCase("Heidi"));
		assertTrue(students.get(1).getNumberOfAttendances() == 20);
		assertTrue(students.get(2).getName().equalsIgnoreCase("Eivind"));
		assertTrue(students.get(2).getNumberOfAttendances() == 12);
		assertTrue(students.get(3).getName().equalsIgnoreCase("Gøran"));
		assertTrue(students.get(3).getNumberOfAttendances() == 12);
		assertTrue(students.get(4).getName().equalsIgnoreCase("Morten"));
		assertTrue(students.get(4).getNumberOfAttendances() == 19);
	}
	
}