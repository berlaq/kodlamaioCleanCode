package kisim1.DataAccess.Abstracts;

import kisim1.Entity.Concretes.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAll();
}
