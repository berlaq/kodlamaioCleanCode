package kisim1.Business.Concretes;

import kisim1.Business.Abstracts.ProductService;
import kisim1.DataAccess.Abstracts.ProductDao;
import kisim1.Entity.Concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
