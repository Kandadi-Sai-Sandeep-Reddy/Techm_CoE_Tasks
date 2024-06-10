package com.app.Spring_Boot_JPA_mysql.Runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.app.Spring_Boot_JPA_mysql.Log4jController;
import com.app.Spring_Boot_JPA_mysql.model.Product;
import com.app.Spring_Boot_JPA_mysql.repo.ProductRepository;
import com.app.Spring_Boot_JPA_mysql.repo.ProductRepository.myView;
import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Component
public class MyRunner implements CommandLineRunner {
	//private final static Logger LOGGER = LoggerFactory.getLogger(MyRunner.class);
	@Autowired
	private ProductRepository repo;
	
	public void run(String...args) throws Exception {
		//insert operation
		/*1.***************SAVE****************/
		System.out.println("Insert Starting");
		repo.save(new Product(1,"Samsung","Paslma",100.5));
		repo.save(new Product(2,"OnePlus","TV",85000.0));
		repo.save(new Product(3,"Vivo","Nord",25000.0));
		System.out.println("Inserted Succesfully");
		
		List<myView> p = repo.findByVendorCode("a");
      	for (myView p1:p) {
      		System.out.println(p1.getVendorCode() + "," + p1.getProdName() + "," + p1.getProdCost());
      	}
	}
}