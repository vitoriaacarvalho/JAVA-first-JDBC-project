package application;

import java.util.List;
import java.util.Scanner;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentDao depDao=DaoFactory.createDepartmentDao();
		
		
		
		
		System.out.println("findAll teste: ");
		List<Department> list=depDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		System.out.println("done!");
		sc.close();

	}

}
