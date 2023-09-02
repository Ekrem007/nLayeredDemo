package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductServices productServices = new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());

        Product product = new Product(1,2,"elma",213,321);
        productServices.add(product);
        ProductServices productServices1 = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());

        productServices1.add(product);




    }
}