package com.samples.SpringORM;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.SpringORM.dao.ProductDAO;
import com.samples.SpringORM.entity.Product;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringORM/Springconfig.xml");
		ProductDAO productDAO = (ProductDAO) springContainer.getBean("productdao");
//		create(productDAO);
//		update(productDAO);
//		delete(productDAO);
		findProduct(productDAO, 1);
//		findAll(productDAO);
		
	}
	private static void create(ProductDAO productDAO)
	{
		Product product = new Product();
		product.setId(405);
		product.setName("mug");
		product.setPrice(70);
 
		productDAO.create(product);
	}
	private static void update(ProductDAO productDAO)
	{
		Product product = new Product();
		product.setId(7);
		product.setName("bucket");
		product.setPrice(100);

		productDAO.update(product);
	}
	private static void delete(ProductDAO productDAO)
	{
		Product product = new Product();
		product.setId(405);
		product.setName("mug");
		product.setPrice(70);

		productDAO.delete(product);
	}
	
	private static void findProduct(ProductDAO productDAO, int id) {
		Product searchResult = productDAO.find(id);
		System.out.println(searchResult);
	}
	private static void findAll(ProductDAO productDAO) {
		List<Product> products = productDAO.findAll();
		System.out.println(products);
	}
}
