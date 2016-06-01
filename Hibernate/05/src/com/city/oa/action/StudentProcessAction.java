package com.city.oa.action;

import com.city.oa.business.IStudentBusiness;
import com.city.oa.business.impl.StudentBusinessImpl;
import com.city.oa.value.CourseValue;
import com.city.oa.value.StudentValue;

public class StudentProcessAction {
	private StudentValue sv = null;
	private int[] cv ;
	
	public StudentValue getSv() {
		return sv;
	}

	public void setSv(StudentValue sv) {
		this.sv = sv;
		
	}
	
	public int[] getCv() {
		return cv;
	}

	public void setCv(int[] cv) {
		this.cv = cv;
	}

	public String add() throws Exception {
		IStudentBusiness isb = new StudentBusinessImpl();
		isb.add(sv);
		isb.addCourses(sv.getSsid(), cv);
		
		return "main";
	}
}
