package model.dao;

import java.util.List;

public interface SellerDao {

		void insert(SellerDao obj);
		void update(SellerDao obj);
		void delete(SellerDao obj);
		SellerDao findById(Integer id);
		List<SellerDao> findAll();
	
}
