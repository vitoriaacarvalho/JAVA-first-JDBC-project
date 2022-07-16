package application;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SellerDao sellerDao=DaoFactory.createSellerDao();
		Department department=new Department(2,null);
		List<Seller> list=sellerDao.findDepartment(department);
		
		System.out.println("seller findAll teste");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("teste deleting seller: ");
		
		
		System.out.println("enter id for delete test: ");
		int id=sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("done!");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
