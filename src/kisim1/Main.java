package kisim1;

import kisim1.Business.Abstracts.ProductService;
import kisim1.Business.Concretes.CustomerManager;
import kisim1.Business.Concretes.ProductManager;
import kisim1.Business.ServiceAdapters.KpsServiceAdapter;
import kisim1.DataAccess.Concretes.EntityFramework.EfProductDao;
import kisim1.DataAccess.Concretes.NhFramework.NhCustomerDao;
import kisim1.Entity.Concretes.Product;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new NhCustomerDao(),new KpsServiceAdapter());
        ProductService productService = new ProductManager(new EfProductDao());

        for (Product product: productService.getAll()) {
            System.out.println(product.getName());
        }


    }

}

class ProductManagers{ //classes are written in PascalCase

    // first fields then constuctors then methods

    private int greatestNumber;

    public ProductManagers(EfProductDao efProductDao) {
        //constructors are written in PascalCase
    }

    public void getAllById(int categoryId){ //local variables are written in camelCase
        //methods are written in camelCase
    }
}


















