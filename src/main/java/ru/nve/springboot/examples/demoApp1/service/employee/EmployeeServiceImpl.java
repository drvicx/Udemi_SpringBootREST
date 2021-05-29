package ru.nve.springboot.examples.demoApp1.service.employee;

import ru.nve.springboot.examples.demoApp1.dao.employee.EmployeeRepository;
import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


/**
 *=Employee Service Implementation
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    // findAll() Method Implementation
    //--get all records
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    //--get single record by id
    @Override
    public Employee findById(int theId) {

        //--Warning: Required type Employee provided Optional<Employee>
        //return employeeRepository.findById(theId);

        //--Fix (Java 8 solution)
        Optional<Employee> result = employeeRepository.findById(theId);

        //--Check if ID is present then return
        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            // we didn't find the employee with this theId value
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }

    //--save/update/add new record
    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    //--delete record by id
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }

}
