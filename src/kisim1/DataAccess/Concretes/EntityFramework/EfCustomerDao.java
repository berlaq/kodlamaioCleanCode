package kisim1.DataAccess.Concretes.EntityFramework;

import kisim1.DataAccess.Abstracts.CustomerDao;
import kisim1.Entity.Concretes.Customer;

public class EfCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Ef veri tabanına eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
