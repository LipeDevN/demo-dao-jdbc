package model.dao;

import java.util.List;

public interface Department {

		void insert(Department obj);
		void update(Department obj);
		void delete(Department obj);
		Department findById(Integer id);
		List<Department> findAll();
	
}
