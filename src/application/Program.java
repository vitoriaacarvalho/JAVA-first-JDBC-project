package application;
import java.util.Date;
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
		
		
		System.out.println("seller insert teste");
		
		Seller newSeller=new Seller(null, "Gregoria", "gregoria@gmail.com",new Date(), 300000.0, department);
		
		sellerDao.insert(newSeller);
		System.out.println("seller inserted into database! new id= "+newSeller.getId());
		
		
		System.out.println("teste do update: ");
		
		newSeller=sellerDao.findById(2);
		
		newSeller.setName("vitória");
		sellerDao.update(newSeller);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
