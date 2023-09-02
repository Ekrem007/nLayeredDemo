package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductServices {



    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("this product can not added.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Product Added:   "+product.getName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
