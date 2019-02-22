package student;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Student)o1).getName().compareTo(((Student)o2).getName());
	}
	

}
