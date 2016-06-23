package com.city.crm.action;

import java.util.List;

import com.city.crm.business.IScoreBusiness;
import com.city.crm.business.impl.ScoreBusinessImpl;
import com.city.crm.value.CourseValue;
import com.city.crm.value.StudentValue;

public class ScoreAddAction {
	
	private CourseValue cv = null;
	private List<StudentValue> stu = null;
	
	public CourseValue getCv() {
		return cv;
	}

	public void setCv(CourseValue cv) {
		this.cv = cv;
	}

	public List<StudentValue> getStu() {
		return stu;
	}

	public void setStu(List<StudentValue> stu) {
		this.stu = stu;
	}

	public String add() throws Exception {
		IScoreBusiness sb = new ScoreBusinessImpl();
		sb.add(cv, stu);
		
		return "tomain";
	}
}
