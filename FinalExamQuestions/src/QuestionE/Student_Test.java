package QuestionE;

import static org.junit.Assert.*;
import QuestionE.Person;
import QuestionE.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "24 Labrador Lae", "309-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("ert", "andall", "ibbons", dBirthDate, "21 Labrador Lne", "392-893-6889", "bibbons@udel.edu","M");
		Student stu3 = new Student("Brt", "Rndall", "Gbbons", dBirthDate, "14 Labrador Lan", "302-899-6889", "bgbbons@udel.edu","MI");
		Student stu4 = new Student("Bet", "Radall", "Gibons", dBirthDate, "214 Larador Lane", "302-893-6899", "bgibons@udel.edu","IS");
		Student stu5 = new Student("Ber", "Ranall", "Gibbns", dBirthDate, "214 Labrdor La", "302-993-6889", "bgibbon@udel.edu","MI");


		assertTrue(1==1);
		
		Map<PersonID, this.Student> students = new HashMap<PersonID, this.Student>;
		students.put(stu1);
		students.put(stu2);
		students.put(stu3);
		students.put(stu4);
		students.put(stu5);
		
		assertTrue(students.size=5);
		
	}

}
