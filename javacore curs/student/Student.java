package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int course;
	
	private static NameComparator nameComparator = new NameComparator();
	private static CourseComparator courseComparator = new CourseComparator();
	
	public Student() {
		super();
	}


	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	public static Comparator getCourseComparator() {
		return courseComparator;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}
	
	public void printStudents (List<Student>students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student element = (Student)iterator.next();
			System.out.println(element.getName() + " " + element.getCourse());
		}
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
	
	
}
