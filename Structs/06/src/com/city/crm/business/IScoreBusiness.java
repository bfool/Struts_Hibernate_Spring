package com.city.crm.business;

import java.util.List;
import java.util.Set;

import com.city.crm.value.CourseValue;
import com.city.crm.value.StudentValue;

public interface IScoreBusiness {
	
	public void add(CourseValue cv, List<StudentValue> sv) throws Exception;
}
