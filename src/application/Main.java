package application;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Department obj= new Department(1, "Books");
		
		Seller seller = new Seller(23, "Bob", "bobbrown@gmail.com", new Date(), 3900.50, obj);
		
		System.out.println(seller);
	}

}
