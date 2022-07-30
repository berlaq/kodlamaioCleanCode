package kisim1.Business.Abstracts;

import kisim1.Entity.Concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
