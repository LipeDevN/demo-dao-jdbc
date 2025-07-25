package model.dao;

import java.util.List;

public interface DepartmentDao {

		void insert(DepartmentDao obj);
		void update(DepartmentDao obj);
		void delete(DepartmentDao obj);
		DepartmentDao findById(Integer id);
		List<DepartmentDao> findAll();
	
}
