package kisim1.Business.Abstracts;

import kisim1.Entity.Concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
