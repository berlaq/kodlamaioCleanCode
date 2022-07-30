package kisim1.DataAccess.Abstracts;

import kisim1.Entity.Concretes.Customer;

public interface CustomerDao {
        void add(Customer customer);
        boolean customerExist(Customer customer);
}
