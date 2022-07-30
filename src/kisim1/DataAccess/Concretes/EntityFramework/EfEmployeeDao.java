package kisim1.DataAccess.Concretes.EntityFramework;

import kisim1.DataAccess.Abstracts.EmployeeDao;
import kisim1.Entity.Concretes.Employee;

import java.util.Arrays;
import java.util.List;

public class EfEmployeeDao implements EmployeeDao {
    @Override
    public List<Employee> getAll() {
        return Arrays.asList(new Employee(1,"berkay","haberal","123456",1999,15000),
                new Employee(2,"Ali","Veli","987654",2005,2500));
    }
}
