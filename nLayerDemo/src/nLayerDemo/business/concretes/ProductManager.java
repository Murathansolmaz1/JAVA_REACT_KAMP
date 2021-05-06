package nLayerDemo.business.concretes;

import java.util.List;

import nLayerDemo.business.abstracts.productService;
import nLayerDemo.core.LoggerService;
import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class ProductManager implements productService {
	
	private ProductDao productDao;
	
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// Ýs kodlari yazilir
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
