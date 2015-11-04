import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentImporterTests {

	
	@org.junit.Test public void TestImportFile(){
		String filePath = "C:\\Users\\Truls\\Desktop\\StudentTest.txt";
		
		ArrayList<Student> students = StudentImporter.importStudents(filePath);
		
		/**
		Truls;15
		Heidi;20
		Eivind;12
		Gøran;12
		Morten;19
		*/
		
		assertTrue(students.size() == 5);
		assertTrue(students.get(0).name.equalsIgnoreCase("Truls"));
		assertTrue(students.get(0).numberOfAttendances == 15);
		assertTrue(students.get(1).name.equalsIgnoreCase("Heidi"));
		assertTrue(students.get(1).numberOfAttendances == 20);
		assertTrue(students.get(2).name.equalsIgnoreCase("Eivind"));
		assertTrue(students.get(2).numberOfAttendances == 12);
		assertTrue(students.get(3).name.equalsIgnoreCase("Gøran"));
		assertTrue(students.get(3).numberOfAttendances == 12);
		assertTrue(students.get(4).name.equalsIgnoreCase("Morten"));
		assertTrue(students.get(4).numberOfAttendances == 19);
	}
	
}