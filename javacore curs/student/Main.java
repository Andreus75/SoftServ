package student;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Vasya", 1));
		students.add(new Student("Kolya", 2));
		students.add(new Student("Vasya", 1));
		students.add(new Student("Olya", 3));
		students.add(new Student("Oleg", 2));
		students.add(new Student("Anna", 3));
		students.add(new Student("Vasya", 1));
		students.add(new Student("Kolya", 3));
		students.add(new Student("Andriy", 1));
		students.add(new Student("Olya", 2));
		
		
		students.sort(new NameComparator());
		System.out.println(students);
		students.sort(new CourseComparator());
		System.out.println(students);
int course = 0;
Student student = new Student();
student.printStudents(students, course);

	}


}
