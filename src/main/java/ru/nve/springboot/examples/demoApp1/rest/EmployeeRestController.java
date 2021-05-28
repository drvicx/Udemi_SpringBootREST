package ru.nve.springboot.examples.demoApp1.rest;

import ru.nve.springboot.examples.demoApp1.dao.employee.EmployeeDAO;
import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 *=EMPLOYEE REST-CONTROLLER
 * http://localhost:7070/employee
 */
@RestController
@RequestMapping("")
public class EmployeeRestController {

    // DAO instance
    private EmployeeDAO employeeDAO;

    // quick and dirty inject employee DAO with Constructor Injection
    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" endpoint
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    //--реализация из урока 464 но без Session слоя
    //  add mapping for GET employees/{employeeId}
    //  http://localhost:7070/api/employees/1
    @GetMapping("employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        //--
        Employee theEmployee = employeeDAO.findById(employeeId);
        //--
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return theEmployee;
    }

}
