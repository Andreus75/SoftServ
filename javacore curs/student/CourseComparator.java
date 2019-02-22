package student;

import java.util.Comparator;

public class CourseComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Student)o1).getCourse() - ((Student)o2).getCourse();
	}
	

}
