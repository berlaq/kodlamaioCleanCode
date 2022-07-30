package kisim1.Business.Concretes;

import kisim1.Business.Abstracts.EmployeeService;
import kisim1.DataAccess.Abstracts.EmployeeDao;
import kisim1.Entity.Concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {

    EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
