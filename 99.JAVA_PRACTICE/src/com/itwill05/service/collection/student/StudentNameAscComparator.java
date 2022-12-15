package com.itwill05.service.collection.student;
import java.util.Comparator;

public class StudentNameAscComparator 
		implements Comparator<Student> {
	@Override

	public int compare(Student t1, Student t2) {
		return t1.getName().compareTo(t2.getName());
	}

}