package com.city.office.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.office.business.IStudentBusiness;
import com.city.office.business.impl.StudentBusinessImpl;
import com.city.office.value.StudentValue;

public class StudentProcessAction {
	
	private StudentValue sv = null;

	public StudentValue getSv() {
		return sv;
	}


	public void setSv(StudentValue sv) {
		this.sv = sv;
	}

	public String add() throws Exception {
		ApplicationContext ac= new ClassPathXmlApplicationContext("context.xml");
		IStudentBusiness sb = ac.getBean("studentBusiness", StudentBusinessImpl.class);
		
		sb.add(sv);
		
		return "tomain";
	}
	
}
