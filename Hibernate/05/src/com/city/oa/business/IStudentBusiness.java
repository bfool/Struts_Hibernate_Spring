package com.city.oa.business;

import com.city.oa.value.StudentValue;

public interface IStudentBusiness {
	public void add(StudentValue sv) throws Exception;
	
	public void addCourse(String id, int courseNo) throws Exception;
	
	public void addCourses(String id, int[] courses) throws Exception;
 }
