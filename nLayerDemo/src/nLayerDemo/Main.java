package nLayerDemo;

import nLayerDemo.business.abstracts.productService;
import nLayerDemo.business.concretes.ProductManager;
import nLayerDemo.core.jLoggerManagerAdapter;
import nLayerDemo.dataAccess.concretes.AbcProductDao;
import nLayerDemo.dataAccess.concretes.HibernateProductDao;
import nLayerDemo.entities.concretes.Product;
import nLayerDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		// ToDo : Spring IoC ile çözülecek
		productService product1 = new ProductManager(new AbcProductDao(), new jLoggerManagerAdapter());
	
	
		Product product = new Product(1,2,"Elma",12,50);
		product1.add(product);
	}

}
