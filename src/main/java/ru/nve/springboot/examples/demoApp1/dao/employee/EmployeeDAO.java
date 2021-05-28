package ru.nve.springboot.examples.demoApp1.dao.employee;

import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;
import java.util.List;


/**
 *=DAO Interface
 */
public interface EmployeeDAO {
    //--get all records
    List<Employee> findAll();
    //--get single record by id
    Employee findById(int theId);
    //--add/save/update record
    void save(Employee theEmployee);
    //--delete record by id
    void deleteById(int theId);
}
