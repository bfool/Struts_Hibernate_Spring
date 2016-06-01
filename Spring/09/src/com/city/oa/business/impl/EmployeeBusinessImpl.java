package com.city.oa.business.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.BehaveValue;
import com.city.oa.value.DepartmentValue;
import com.city.oa.value.EmployeeValue;

public class EmployeeBusinessImpl implements IEmployeeBusiness {

	@Override
	public void add(EmployeeValue ev) throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
			
		session.save(ev);
		
		tx.commit();
		
		session.close();
		
		
		

	}

	@Override
	public void add(String id, String password, String name, int age,
			Date birthday, double salary, String sex, int departmentNo)
			throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		EmployeeValue ev=new EmployeeValue();
		
		ev.setId(id);
		ev.setPassword(password);
		ev.setName(name);
		
		ev.setAge(age);
		
		DepartmentValue dv=session.get(DepartmentValue.class, departmentNo);
		
		ev.setDepartment(dv);
			
		session.save(ev);
		
		tx.commit();
		
		session.close();
		
	}

	@Override
	public List<EmployeeValue> getListByDepartment(int departmentNo)
			throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		/*
		DepartmentValue dv=session.get(DepartmentValue.class, departmentNo);
		Set<EmployeeValue> employees=dv.getEmployees();
		List<EmployeeValue> list=new ArrayList<EmployeeValue>();
		list.addAll(employees);
		*/
		
		//String hql="select ev from EmployeeValue ev inner join ev.department dv where dv.no=:no";
		String hql="select ev from EmployeeValue ev where ev.department.no=:no";
		Query query=session.createQuery(hql);
		query.setInteger("no", departmentNo);
		List<EmployeeValue> list=query.list();
		tx.commit();
		
		session.close();
		
		return list;
	}

	@Override
	public void modify(EmployeeValue ev) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EmployeeValue ev) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeValue gotEmployee(String id) throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		EmployeeValue ev=session.get(EmployeeValue.class, id);
		tx.commit();
		session.close();
		
		return ev;
	}

	@Override
	public void addBehave(String employeeId, int behaveNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBehaves(String employeeId, int[] behaves) throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		//
		EmployeeValue ev=session.get(EmployeeValue.class, employeeId);
		for(int bno:behaves){
			BehaveValue bv=session.get(BehaveValue.class, bno);
			ev.getBehaves().add(bv);
			bv.getEmployees().add(ev);
		}
		//
		tx.commit();
		session.close();
		
		
		
		
	}

	@Override
	public boolean validate(String id, String password) throws Exception {
		boolean result=false;
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String hql="select count(ev.id) from EmployeeValue ev where ev.id=:id and ev.password=:password";
		Query query=session.createQuery(hql);
		query.setString("id",id);
		query.setString("password",password);
		long count=(Long)query.uniqueResult();
		if(count>0){
			result=true;
		}
		tx.commit();
		session.close();
		return result;
	}

	@Override
	public List<EmployeeValue> getListByAll() throws Exception {
		String hql="from EmployeeValue ev";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<EmployeeValue> list=query.list();
		
		tx.commit();
		session.close();
		
		return list;
	}

	@Override
	public List<EmployeeValue> getListByBehave(int behaveNo) throws Exception {
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		BehaveValue bv=session.get(BehaveValue.class, behaveNo);
		Set<EmployeeValue> employees=bv.getEmployees();
		List<EmployeeValue> list=new ArrayList<EmployeeValue>();
		list.addAll(employees);
		tx.commit();
		session.close();
		
		return list;
	}
	
	@Override
	//取得年龄在low和hight之间的员工列表
	public List<EmployeeValue> getListByAgeScope(int low, int high)
			throws Exception {
		String hql="from EmployeeValue ev where ev.age between :low and :high";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setInteger("low", low);
		query.setInteger("high", high);
		List<EmployeeValue> list=query.list();
		
		tx.commit();
		session.close();
		return list;
	}
	//取得所有的员工人数
	@Override
	public int getCountByAll() throws Exception {
		
		String hql="select count(ev.id) from EmployeeValue ev";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		int count=((Long)query.uniqueResult()).intValue();
		tx.commit();
		session.close();
		return count;
	}

	@Override
	public int getCountByDepartment(int departmentNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	//取得有爱好的员工列表
	public List<EmployeeValue> getListWithBehave() throws Exception{
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		tx.commit();
		session.close();
		
		
		return null;
	}
	@Override
	//取得没有爱好的员工列表
	public List<EmployeeValue> getListWithoutBehave() throws Exception {
		
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from EmployeeValue ev where ev not int (from EmployeeValue ev inner join ev.behaves bv)";
		
		tx.commit();
		session.close();
		
		
		return null;
	}

	@Override
	//按姓名检束员工列表
	public List<EmployeeValue> getListBySearchName(String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeValue> getListByAllWithPage(int rows, int pageIndex)
			throws Exception {
		String hql="from EmployeeValue ev";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		
		query.setFirstResult(rows*(pageIndex-1));
		query.setMaxResults(rows);
		
		List<EmployeeValue> list=query.list();
		
		tx.commit();
		session.close();
		
		return list;
		
	}
	//取得指定部门的员工人数
	public int getEmployeeCountByDepartment(int departmentNo) throws Exception{
		int count=0;
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="select count(ev.id) from EmployeeValue ev where ev.department.no=:no";
		Query query=session.createQuery(hql);
		query.setInteger("no", departmentNo);
		count=((Long)query.uniqueResult()).intValue();
		
		tx.commit();
		session.close();
		
		
		return count;
		
	}
	//取得指定部门的员工人数
	public List<Long> getEmployeeCountByEachDepartment() throws Exception{
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="select count(ev.id) from EmployeeValue ev group by ev.department.no";
		Query query=session.createQuery(hql);
		List<Long> list=query.list();
		tx.commit();
		session.close();
		return list;
	}
	//取得大于公司平均工资的员工列表
	public List<EmployeeValue> getListByGreatWholeAvgSalary() throws Exception
	{
		String hql="from EmployeeValue ev where ev.salary>(select avg(ev.salary) from EmployeeValue)";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		
		
		
		List<EmployeeValue> list=query.list();
		
		tx.commit();
		session.close();
		
		return list;
		
	}
	//取得大于本部门平均工资的员工列表
	public List<EmployeeValue> getListByGreatDepartmentAvgSalary() throws Exception
	{
		String hql="from EmployeeValue ev where ev.salary>(select avg(ev1.salary) from EmployeeValue ev1 where ev1.department=ev.department)";
		SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		
		
		
		List<EmployeeValue> list=query.list();
		
		tx.commit();
		session.close();
		
		return list;
	}
	

}
