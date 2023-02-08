package com.test.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test.employee.Exception.GlobalException;
import com.test.employee.entity.Address;
import com.test.employee.entity.Employee;

public class EmployeeService {
	
	private static List<Employee> employee=new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);
	
	//method to add employee details in array list
	public void addEmployee(long empId,String name,double salary,
			String city, String country)
	{
		Address address =new Address(city,country);
		employee.add(new Employee(empId,name,salary,address));
	}
	
	//for testing using builder annotation
	public void addEmp(Employee emp)
	{
		employee.add(emp);
	}
	
	//method to display all employee details
	public void displayAllEmployee()
	{
		for(Employee emp: employee)
		{
			System.out.println("Employee Id: "+emp.getEmpId());
			System.out.println("Employee Name: "+emp.getName());
			System.out.println("Employee Salary: "+emp.getSalary());
			System.out.println("Employee Address: "+emp.getAddress().getCity()
					+" "+emp.getAddress().getCountry());
	    }
	}
	
	public Employee displayEmpById(int id) throws GlobalException
	{
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
	//			System.out.println("Employee Id: "+((Employee) employee).getEmpId());
	//			System.out.println("Employee Name: "+ employee.getName());
	//			System.out.println("Employee Salary: "+ employee.getSalary());
	//			System.out.println("Employee Address: "+ employee.getAddress().getCity()
	//					+" "+ employee.getAddress().getCountry());
				return employee.get(i);
			}
			else
			{
				throw new GlobalException("Employee ID not found!!");
			}
		}
		return null;
	}
	
	//update Employee
	public Employee updateEmp(int index,Employee emp)
	{
		return employee.set(index, emp);
	}
	
	
	public Employee findId(int id)
	{
		Employee emp=null;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				emp= employee.get(i);
			}
		}
		return emp;
		
	}
	
	public int lenghtOfList()
	{
		return employee.size();
	}
	
	public void RemoveId(int id)
	{
		//Employee emp=null;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				employee.remove(i);
			}
		}
	}
	
	public String RemoveAllemployee()
	{
		employee.clear();
		return "All employee details deleted successfully!!";
	}

	public double calculateYearlySalary(int id)
	{
		double yearlySalary=0.0;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				yearlySalary= employee.get(i).getSalary()*12;
			}
		}
		return yearlySalary;
	}
	
	public double calculateAppraisal(int id)
	{
		double appraisal=0;
		for(int i=0;i<employee.size();i++)
		{
		if(employee.get(i).getSalary()<10000)
		{
			appraisal=1000;
		}
		else if((employee.get(i).getSalary()>10000) &&(employee.get(i).getSalary()<20000))
		{
			appraisal=2000;
		}
		else
		{
			appraisal=2500;
		}
		}
		return appraisal;
	}
}

