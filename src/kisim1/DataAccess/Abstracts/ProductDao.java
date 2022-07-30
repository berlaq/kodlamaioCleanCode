package kisim1.DataAccess.Abstracts;

import kisim1.Entity.Concretes.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();

}
