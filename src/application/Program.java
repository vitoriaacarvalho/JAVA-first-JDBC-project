package application;
import dao.DaoFactory;
import dao.SellerDao;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao=DaoFactory.createSellerDao();
	
		Seller seller=sellerDao.findById(3);
		
		System.out.println(seller+"aqui mizera");
		
	}

}
