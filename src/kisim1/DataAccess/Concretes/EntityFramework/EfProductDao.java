package kisim1.DataAccess.Concretes.EntityFramework;

import kisim1.DataAccess.Abstracts.ProductDao;
import kisim1.Entity.Concretes.Product;

import java.util.Arrays;
import java.util.List;

public class EfProductDao implements ProductDao {
    @Override
    public List<Product> getAll() {
        return Arrays.asList(new Product("elma"),new Product("armut"));
    }
}
