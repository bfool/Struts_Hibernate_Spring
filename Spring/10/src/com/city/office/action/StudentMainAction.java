package com.city.office.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.office.business.IStudentBusiness;
import com.city.office.business.impl.StudentBusinessImpl;
import com.city.office.value.StudentValue;

public class StudentMainAction {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		IStudentBusiness sb = ac.getBean("studentBusiness", StudentBusinessImpl.class);
		
		StudentValue sv = new StudentValue();
		sv.setSid("1");
		sv.setSname("a");
		sv.setSex("x");
		sv.setAge(8);
		
//		sb.add(sv);
		
//		System.out.println(sb.getStudent("1").getSname());
		
//		List<StudentValue> list = sb.getList();
//		for(StudentValue stu : list) {
//			System.out.println(stu.getSex());
//		}
		
//		System.out.println(sb.getStudentCount());
		
		System.out.println(sb.getCountByAge(5, 10));
		
//		System.out.println(sb.getAvgAge());
	}
}
