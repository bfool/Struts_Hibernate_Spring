package com.city.office.business;

import java.util.List;

import com.city.office.value.StudentValue;

public interface IStudentBusiness {
	public void add(StudentValue sv) throws Exception;

	public StudentValue getStudent(String id) throws Exception;

	public List<StudentValue> getList() throws Exception;

	public int getStudentCount() throws Exception;

	public int getCountByAge(int min, int max) throws Exception;

	public double getAvgAge() throws Exception;
}
