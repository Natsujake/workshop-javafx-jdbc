package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellersDao;
import model.entities.Sellers;

public class SellerService {

	private SellersDao dao = DaoFactory.createSellerDao();
	
	public List<Sellers> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Sellers obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Sellers obj) {
		dao.deleteById(obj.getId());
	}
	
	
}
