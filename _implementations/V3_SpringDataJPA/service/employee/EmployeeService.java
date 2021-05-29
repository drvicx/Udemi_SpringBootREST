package ru.nve.springboot.examples.demoApp1.service.employee;

import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;
import java.util.List;


/**
 *=Employee Service Interface
 */
public interface EmployeeService {
    //--get all records
    public List<Employee> findAll();
    //--get single record by id
    public Employee findById(int theId);
    //--add/save/update record
    public void save(Employee theEmployee);
    //--delete record by id
    public void deleteById(int theId);
}
