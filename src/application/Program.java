package application;
import java.util.List;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao=DaoFactory.createSellerDao();
		Department department=new Department(2,null);
		List<Seller> list=sellerDao.findDepartment(department);
		System.out.println("seller findAll teste");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
