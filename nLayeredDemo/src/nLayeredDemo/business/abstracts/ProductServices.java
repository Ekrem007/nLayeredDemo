package nLayeredDemo.business.abstracts;

import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductServices  {
    void add(Product product);
    List<Product> getAll();
}
