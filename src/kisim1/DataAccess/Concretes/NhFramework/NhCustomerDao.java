package kisim1.DataAccess.Concretes.NhFramework;

import kisim1.DataAccess.Abstracts.CustomerDao;
import kisim1.Entity.Concretes.Customer;

public class NhCustomerDao implements CustomerDao {

    @Override
    public void add(Customer customer) {
        System.out.println("nh veri tabanına eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}