package application;

import java.util.Scanner;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentDao depDao=DaoFactory.createDepartmentDao();
		
		
		
		
		System.out.println("find by id teste: ");
		Department dep=depDao.findById(2);
		
		System.out.println("done!"+dep);
		sc.close();

	}

}
